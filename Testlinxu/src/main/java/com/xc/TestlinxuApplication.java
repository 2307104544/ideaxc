package com.xc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan(basePackages = "com.xc.dao")
@SpringBootApplication
public class TestlinxuApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestlinxuApplication.class, args);
    }

}
