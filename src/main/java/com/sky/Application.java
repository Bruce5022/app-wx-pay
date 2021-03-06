package com.sky;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 */
@SpringBootApplication
@MapperScan("com.sky.mapper")
public class Application {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        SpringApplication.run(Application.class, args);
    }
}
