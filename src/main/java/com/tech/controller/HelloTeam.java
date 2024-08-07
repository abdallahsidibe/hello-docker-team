package com.tech.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class HelloTeam {

    @GetMapping("hello")
    public String sayHello(){
        return "Hello everyone ! I hope you're doing well.";
    }
}
