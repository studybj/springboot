package com.bj.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
    @GetMapping("/sayHello")
    public String sayHello(){
        return "a";
    }
}
