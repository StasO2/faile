package com.example.testproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class jaba {
    public static void main(String[] args) {
        SpringApplication.run(jaba.class, args);
    }
    @GetMapping("https://www.google.com/")
    public void quit() {
        System.out.println("Hello world!");
    }
}
