package com.example.ssm.controller;

import com.example.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {

    /*@RequestMapping(value="{pageName}")
    public String pages(@PathVariable("pageName")String pageName){
        return pageName;
    }*/
    @Autowired
    UserService userService;

    @RequestMapping(value="js.html")
    public String jsPage(){
        return "js";
    }

    @RequestMapping(value="login.html")
    public String loginPage(){
        return "login";
    }

    @RequestMapping(value="checkLogin")
    public String checkLogin(@RequestParam("name")String name,
                             @RequestParam("password")String password){
        if(null!=userService.getUser(name,password)){
            return "htmlcss";
        }
        return "redirect:login.html";
    }


}
