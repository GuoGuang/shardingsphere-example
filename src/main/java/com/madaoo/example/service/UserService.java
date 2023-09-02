package com.madaoo.example.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.madaoo.example.mapper.UserMapper;
import com.madaoo.example.pojo.User;
import org.apache.shardingsphere.transaction.annotation.ShardingTransactionType;
import org.apache.shardingsphere.transaction.core.TransactionType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService extends ServiceImpl<UserMapper, User> {

    @Autowired
    UserMapper userMapper;

    public void insertMaster(User user) {
        userMapper.insert(user);
    }

    @ShardingTransactionType(TransactionType.XA)
    @Transactional
    public void insertTransactionSuccessful(User user) {
        userMapper.insert(user);
    }

    public void insertTransactionFailed(User user) {
        userMapper.insert(user);
    }

    public List<User> joinTable() {
        return userMapper.joinTable();
    }
}
