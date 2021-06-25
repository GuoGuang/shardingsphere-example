package com.madaoo.example.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("test_")
public class Test {

    private Long id;

    private String text;

    private Date date;
}
