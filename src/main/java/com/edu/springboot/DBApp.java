package com.edu.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.edu.springboot")
public class DBApp {
    public static void main(String[] args){
        SpringApplication.run(DBApp.class,args);
    }
}
