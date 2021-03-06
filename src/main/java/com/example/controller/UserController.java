package com.example.controller;

import com.example.model.User;
import com.example.service.UserService;
import com.example.util.Mylog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * lupeng
 * 2019/2/19
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {


    

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/add", produces = {"application/json;charset=UTF-8"})
    public int addUser(User user) {
        return userService.addUser(user);
    }

    @ResponseBody
    @Mylog(value = "test",name ="lupeng")
    @RequestMapping(value = "/all/{pageNum}/{pageSize}", produces = {"application/json;charset=UTF-8"})
    public Object findAllUser(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize) {
        System.out.println("进入方法");
        return userService.findAllUser(pageNum, pageSize);

        
    }
}


