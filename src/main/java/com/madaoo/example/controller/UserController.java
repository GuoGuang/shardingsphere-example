package com.madaoo.example.controller;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.RandomUtil;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.madaoo.example.pojo.User;
import com.madaoo.example.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Random;

@RestController
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping("/user")
    public void aa() {
        Snowflake snowflake = new Snowflake();
        Random random = new Random();
        long startTime = DateUtil.parse("2022-01-01 00:00:00").getTime();
        long endTime = DateUtil.parse("2023-12-31 23:59:59").getTime();
        for (long i = 0; i < 10; i++) {
            User user = new User();
            user.setId(snowflake.nextIdStr());
            user.setName(new Date().getTime() + "");
            user.setAge(RandomUtil.randomInt(1, 100));
            user.setGender(RandomUtil.randomBoolean());
            user.setDate(new Date(startTime + (long) (random.nextDouble() * (endTime - startTime + 1))));
            userService.insertMaster(user);
        }

        // 插入无性别数据
        User user = new User();
        user.setId(snowflake.nextIdStr());
        user.setName(new Date().getTime() + "");
        user.setAge(RandomUtil.randomInt(1, 100));
        user.setGender(null);
        user.setDate(new Date(startTime + (long) (random.nextDouble() * (endTime - startTime + 1))));
        userService.insertMaster(user);
    }


    @GetMapping("/user")
    public List<User> bb() {
        QueryWrapper<User> user = new QueryWrapper<User>()
                .eq("gender", false)
                .eq("age",94);
        List<User> list = userService.list(user);
        return list;
    }

    @PutMapping("/user")
    public void cc() {
        // 只有当set子句中设置的新值等于where子句中给定的旧值时，才不会抛出异常
        UpdateWrapper<User> user = new UpdateWrapper<User>()
                .set("name", "666")
                .eq("gender", false)
                .eq("age",94);
        userService.update(user);
    }

    @DeleteMapping("/user")
    public void dd() {
        Wrapper<User> eq = new QueryWrapper<User>()
                .eq("gender", false)
                .eq("age", 94);
        userService.remove(eq);
    }

    /**
     * 连表查询场景
     */
    @GetMapping("/join")
    public List<User> ee() {
        return userService.joinTable();
    }
}
