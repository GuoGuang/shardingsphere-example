package com.madaoo.example;

import com.madaoo.example.pojo.User;
import com.madaoo.example.service.TestService;
import com.madaoo.example.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SampleTest {

    @Resource
    private TestService testService;

    @Test
    public void testSave() throws Exception {
        for (long i = 0; i < 10; i++) {
            com.madaoo.example.pojo.Test test = new com.madaoo.example.pojo.Test();
            test.setId(i);
            test.setText(i+"");
            test.setDate(new Date());
            testService.save(test);
        }
    }

    @Resource
    private UserService userService;

    @Test
    public void insert_test() throws Exception {
        for (long i = 0; i < 10; i++) {
            User user1 = new User();
            user1.setId(i);
            user1.setName("1");
            user1.setAge(i);
            user1.setDate(new Date());
            userService.insertMaster(user1);
        }
    }
}
