package com.madaoo.example.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private Long id;
    private String name;
    private Long age;
    private String email;
    private Date date;
}
