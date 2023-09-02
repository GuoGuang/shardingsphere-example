package com.madaoo.example.service;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.madaoo.example.mapper.TestMapper;
import com.madaoo.example.pojo.Test;
import org.springframework.stereotype.Service;

@Service
public class TestService extends ServiceImpl<TestMapper, Test>{

    public static void main(String[] args) {

        DateTime start = DateUtil.parseDate("2022-01-01 00:00:00");
        DateTime end = DateUtil.parseDate("2023-01-01 00:00:00");
        System.out.println(start.before(end));
    }
}
