package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.mapper.TestMapper;
import com.example.demo.pojo.Test;
import org.springframework.stereotype.Service;

@Service
public class TestService extends ServiceImpl<TestMapper, Test>{
}
