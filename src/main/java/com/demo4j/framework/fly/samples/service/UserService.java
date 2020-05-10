package com.demo4j.framework.fly.samples.service;

import com.demo4j.framework.fly.samples.param.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public String addUser(User user) {
        return "success";
    }
}
