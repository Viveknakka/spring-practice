package com.telusko.springsecdemo.controller;

import com.telusko.springsecdemo.dao.UserRepo;
import com.telusko.springsecdemo.model.User;
import com.telusko.springsecdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class UserController {
    @Autowired
    private UserService service;
    @PostMapping("register")
    private String register(@RequestBody User user){

        service.saveUser(user);
        return "registered successfully...";
    }

}
