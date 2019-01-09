package com.api2doc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.api2doc.bean.User;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @GetMapping
    @PostMapping
    @ResponseBody
    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public User addUser(String group, String name, String type) {
    	User rser = new User();
    	rser.setId("1");
    	rser.setName("admin");
        return rser;
    }
}
