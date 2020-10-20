package com.login.demo.controller;


import com.alibaba.fastjson.JSONObject;
import com.login.demo.pojo.User;
import com.login.demo.service.UserService;
import com.login.demo.utils.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    public UserService userService;

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @PostMapping("/verifyUserLogin")
    public String verifyUserLogin(User user){
        if(userService.verifyUserLogin(user)){
            return JSONObject.toJSONString(JsonUtil.retSuccess("verify success"));
        }
        return JSONObject.toJSONString(JsonUtil.retSuccess("verify success"));
    }

    @GetMapping("/getUserList")
    public String getUserList(){
        List<User> users = userService.getUserList();
        return JSONObject.toJSONString(users);
    }
}
