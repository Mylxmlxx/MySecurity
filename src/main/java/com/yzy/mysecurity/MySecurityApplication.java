package com.yzy.mysecurity;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yzy.mysecurity.mapper")
public class MySecurityApplication {
    public static void main(String[] args) {
        SpringApplication.run(MySecurityApplication.class, args);
    }

}
