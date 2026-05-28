package com.claimxpert.controller;

import com.claimxpert.entity.User;
import com.claimxpert.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return service.register(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody User user) {
        service.login(user.getUsername(), user.getPassword());
        return "Login Successful";
    }
}