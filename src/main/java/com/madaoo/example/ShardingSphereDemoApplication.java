package com.madaoo.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(" com.madaoo.example.mapper")
public class ShardingSphereDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingSphereDemoApplication.class, args);
    }

}
