package com.example.testproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ketApplication {
    public static void main(String[] args) {
        SpringApplication.run(ketApplication.class, args);
    }
    @GetMapping("/hello")
    public String pip(@RequestParam(value = "name", defaultValue = "Issss") String name ) {
        return String.format("Hello %s!", name);
    }
}
