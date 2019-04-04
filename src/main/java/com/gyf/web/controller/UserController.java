package com.gyf.web.controller;

import com.gyf.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //声明Rest风格的控制器
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserServiceImpl userService;


    @GetMapping("register")
    @ResponseBody
    public String register(@RequestParam("username") String username,@RequestParam("password") String password){
        //把数据保存到test1数据库
        userService.register(username,password);
        return "success";
    }

    @RequestMapping("login")
    public String login(String username,String password){
        //model.addattribte(path,"test2")
        return "user/list";
    }


}
