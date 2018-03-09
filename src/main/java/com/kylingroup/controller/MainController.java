package com.kylingroup.controller;

import java.util.ArrayList;
import java.util.List;

import com.kylingroup.entity.User;
import com.kylingroup.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by mark on 4/24/15.
 */

@Controller
@RequestMapping("/Main")
public class MainController {

    @Autowired
    private UserService userService;

    @RequestMapping("/home")
    public String home(){
        List<User> us = new ArrayList<User>();
        User u = new User();
        u.setUsername("Hello");
        us.add(u);
        u = new User();
        u.setUsername("World");
        us.add(u);
        userService.saveUsers(us);
        return "index";
    }

    @RequestMapping("/json")
    @ResponseBody
    public List<User> json(){
        System.out.println("所有用户名："+userService.getAllUsernames().toString());
        return userService.getAllUsernames();
    }

    @RequestMapping("/echo")
    public String WebSocketTest(){
        return "Echo";
    }
}