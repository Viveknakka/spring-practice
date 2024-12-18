package com.example.SpringSecurityDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class MyController {

    @GetMapping("hello")
    public String greet(HttpServletRequest request) {
        return "Hello World "+request.getSession().getId();
    }
   @PostMapping("add")
   public String add(int num1,int num2){
        return num1+num2+"";
   }

    @GetMapping("about")
    public String about(HttpServletRequest request) {
        return "Telusko "+request.getSession().getId();
    }
}