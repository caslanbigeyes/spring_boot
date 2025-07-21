package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class Hello {
    @RequestMapping("/hello")
    public String hello(@RequestParam String name) {
        return "Hello " + name;
    }

    @RequestMapping("/hello2")
    public String hello2(@RequestParam String name) {
        return "Hello " + name;
    }
}
