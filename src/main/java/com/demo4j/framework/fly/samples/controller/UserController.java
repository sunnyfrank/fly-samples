package com.demo4j.framework.fly.samples.controller;

import com.demo4j.framework.fly.samples.param.User;
import com.demo4j.framework.fly.samples.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

@RestController
@RequestMapping("user")
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping("/addUser")
    public String addUser(@RequestBody @Valid User user) {
        return userService.addUser(user);
    }

    @GetMapping("/getUser")
    public User getUser() {
        User user = new User();
        user.setId(1L);
        user.setAccount("12345678");
        user.setPassword("12345678");
        user.setEmail("123@qq.com");
        return user;
    }
}