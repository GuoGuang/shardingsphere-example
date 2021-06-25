

# shardingsphere-example
一个最小可执行的shardingsphere-example案例

# Getting Started

### 0、准备数据

ShardingSphere是中间件，做的事情就是给每个sql进行路由，简化我们分库分表之后的操作，分库分表是 `动作`,  ShardingSphere不参与这个，所以我们的数据库架构需要预处理，先分别准备两个库：db0、db1；然后每个库分别包含两个表：user_0，user_1；

```sql
CREATE TABLE `user_0`  (
  `id` bigint(20) NOT NULL COMMENT '主键ID',
  `name` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `age` int(11) NULL DEFAULT NULL COMMENT '年龄',
  `email` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  `date` datetime NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

CREATE TABLE `user_1`  (
  `id` bigint(20) NOT NULL COMMENT '主键ID',
  `name` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `age` int(11) NULL DEFAULT NULL COMMENT '年龄',
  `email` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  `date` datetime NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

INSERT INTO user_0 (id, name, age, email) VALUES
(1, 'Jone', 18, 'test1@baomidou.com'),
(2, 'Jack', 20, 'test2@baomidou.com'),
(3, 'Tom', 28, 'test3@baomidou.com'),
(4, 'Sandy', 21, 'test4@baomidou.com'),
(5, 'Billie', 24, 'test5@baomidou.com');
```

### 1、添加依赖

```java
<dependency>
	<groupId>org.apache.shardingsphere</groupId>
	<artifactId>sharding-jdbc-spring-boot-starter</artifactId>
	<version>4.1.1</version>
</dependency>
```

### 2、配置表路由规则

```yaml
spring:
  main:
    allow-bean-definition-overriding: true
  shardingsphere:
    datasource:
      names: db0,db1
      db0:
        type: com.alibaba.druid.pool.DruidDataSource
        driver-class-name: com.mysql.cj.jdbc.Driver
        url: jdbc:mysql://localhost:3306/db0?serverTimezone=GMT%2B8&characterEncoding=UTF-8
        username: root
        password: 123456
      db1:
        type: com.alibaba.druid.pool.DruidDataSource
        driver-class-name: com.mysql.cj.jdbc.Driver
        url: jdbc:mysql://localhost:3306/db1?serverTimezone=GMT%2B8&characterEncoding=UTF-8
        username: root
        password: 123456
    sharding:
      # 默认分库策略
      default-database-strategy:
        inline:
          sharding-column: id
          algorithm-expression: db$->{id % 2}
      tables:
        # 表名
        user:
          # 真实表,数据库、表的分库分表情况说明
          actual-data-nodes: db${0..1}.user_${0..1}
          # 默认分库策略
          database-strategy:
            inline:
              sharding-column: id
              algorithm-expression: db$->{id % 2}
          # 分表策略
          table-strategy:
            inline:
              sharding-column: id
              algorithm-expression: user_$->{id % 2}
    props:
      sql:
        show: true
```

### 3. 测试

```java
@Test
public insert_test()throwsException {
	for(longi = 0; i < 10; i++) {
        User user = newUser();
        user.setId(i);
        user.setName("1");
        user.setAge(i);
        user.setDate(new Date());
        userService.insertMaster(user);
    }
}
```
