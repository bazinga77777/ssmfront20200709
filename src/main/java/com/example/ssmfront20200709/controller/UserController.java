package com.example.ssmfront20200709.controller;

import com.example.ssmfront20200709.entity.User;
import com.example.ssmfront20200709.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value="test",method = RequestMethod.POST)
    public @ResponseBody User test(@RequestBody User user){
        User user1=userService.getUser(user.getName(),user.getPassword());
        System.out.println(user1);
        return user1;
    }

    @RequestMapping(value="testAll")
    public @ResponseBody List<User> testALL(){
        List<User> userList = userService.getUserAll();
        System.out.println(userList);
        return userList;
    }



}
