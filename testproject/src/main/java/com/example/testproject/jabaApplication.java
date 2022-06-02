package com.example.testproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@Configuration
@RestController
public class jabaApplication {
    @GetMapping("/helo")
    public void hehe(String[] args) {
        SpringApplication.run(jaba.class, args);
        System.out.println("Hello world!");
    }
}
