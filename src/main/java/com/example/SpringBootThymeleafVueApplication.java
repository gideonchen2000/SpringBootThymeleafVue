package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.mapper.*")

public class SpringBootThymeleafVueApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootThymeleafVueApplication.class, args);
    }

}
