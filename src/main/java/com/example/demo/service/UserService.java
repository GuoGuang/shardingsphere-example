package com.example.demo.service;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.mapper.UserMapper;
import com.example.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService extends ServiceImpl<UserMapper, User> {

    @Autowired
    UserMapper userMapper;

//    @DS("gits_sharding")
    public void insertSlave(User user) {
        userMapper.insert(user);
    }

//    @DS("gits_sharding")
    public void insertMaster(User user) {
        userMapper.insert(user);
    }
}
