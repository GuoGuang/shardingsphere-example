package com.madaoo.example.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private String id;
    private String name;
    private int age;
    private String email;
    private Boolean gender;
    private Date date;
}
