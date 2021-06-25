package com.example.demo.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.pojo.Test;
import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class TestController {

    @Autowired
    TestService testService;

    @PostMapping(value="/insert")
    public void insertTest (){
        Test t = new Test();
        t.setDate(new Date());
        t.setText("text");
        testService.save(t);
    }

    @PostMapping(value="/get")
    public Test getTest (@RequestBody Test test){
        QueryWrapper<Test> qwt = new QueryWrapper<>(test);
        return testService.getOne(qwt);
    }

    @GetMapping (value="/getByDate")
    public Test getTestByDate (@RequestParam String begin ,@RequestParam String end,@RequestParam String text) throws ParseException {
        QueryWrapper<Test> qwt = new QueryWrapper<>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date beginDate = sdf.parse(begin);
        Date endDate = sdf.parse(end);
        qwt.between("date",beginDate,endDate).eq("text",text);
        return testService.getOne(qwt);
    }

}
