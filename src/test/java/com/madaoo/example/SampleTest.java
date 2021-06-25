package com.madaoo.example;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.madaoo.example.pojo.User;
import com.madaoo.example.service.TestService;
import com.madaoo.example.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SampleTest {

    @Resource
    private TestService testService;

    @Resource
    private UserService userService;
    @Resource
    private JdbcTemplate jdbcTemplate;

    @Test
    public void testSave() throws Exception {
        for (long i = 0; i < 10; i++) {
            com.madaoo.example.pojo.Test test = new com.madaoo.example.pojo.Test();
            test.setId(i);
            test.setText(i + "");
            test.setDate(new Date());
            testService.save(test);
        }
    }

    @Test
    public void insert_test() throws Exception {
        for (long i = 0; i < 10; i++) {
            User user = new User();
            user.setId(i);
            user.setName("1");
            user.setAge(i);
            user.setDate(new Date());
            userService.insertMaster(user);
        }
    }

    /**
     * 事务生效，数据回滚
     *
     * @throws Exception
     */
    @Test
    public void xa_transaction_successful() throws Exception {
        User user = new User();
        user.setId(2l);
        user.setName("2");
        user.setDate(new Date());
        userService.insertTransactionSuccessful(user);

        User user1 = new User();
        user1.setId(3l);
        user1.setName("3");
        user1.setDate(new Date());
        userService.insertTransactionSuccessful(user1);
        throw new RuntimeException();
    }

    /**
     * 事务未生效，数据依旧插入
     *
     * @throws Exception
     */
    @Test
    public void xa_transaction_failed() throws Exception {
        User user = new User();
        user.setId(2l);
        user.setName("2");
        user.setDate(new Date());
        userService.insertTransactionFailed(user);

        User user1 = new User();
        user1.setId(3l);
        user1.setName("3");
        user1.setDate(new Date());
        userService.insertTransactionFailed(user1);
        throw new RuntimeException();
    }

    @Test
    public void find_test() throws Exception {
/*        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.lambda().eq(User::getAge, 28);
        User one = userService.getOne(userQueryWrapper);
        System.out.println(one);*/

        QueryWrapper<User> userQueryWrapperData = new QueryWrapper<>();
        userQueryWrapperData.lambda().between(User::getDate, new Date(),new Date());
        User one = userService.getOne(userQueryWrapperData);
        System.out.println(one);

    }

    @Test
    public void delete_test() throws Exception {
        userService.removeById(1);
    }
}
