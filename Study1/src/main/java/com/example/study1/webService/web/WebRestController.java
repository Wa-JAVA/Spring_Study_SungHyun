package com.example.study1.webService.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebRestController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello World!";
    }

    @GetMapping("/java")
    public String java(){
        return "JAVA World!";
    }

    @GetMapping("/python")
    public String python(){
        return "Python World!";
    }
}
