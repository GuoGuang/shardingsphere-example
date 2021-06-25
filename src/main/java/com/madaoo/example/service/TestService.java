package com.madaoo.example.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.madaoo.example.mapper.TestMapper;
import com.madaoo.example.pojo.Test;
import org.springframework.stereotype.Service;

@Service
public class TestService extends ServiceImpl<TestMapper, Test>{
}
