package com.example.demo;

import com.example.demo.pojo.User;
import com.example.demo.service.TestService;
import com.example.demo.service.UserService;
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
            com.example.demo.pojo.Test test = new com.example.demo.pojo.Test();
            test.setId(i);
            test.setText(i+"");
            test.setDate(new Date());
            testService.save(test);
        }
    }

    @Resource
    private UserService userService;

    @Test
    public void testSavea() throws Exception {
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
