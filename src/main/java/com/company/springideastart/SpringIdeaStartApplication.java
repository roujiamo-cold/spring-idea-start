package com.company.springideastart;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.company.springideastart.dao")
public class SpringIdeaStartApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringIdeaStartApplication.class, args);
    }

}
