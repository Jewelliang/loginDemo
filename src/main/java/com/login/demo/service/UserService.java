package com.login.demo.service;

import com.login.demo.pojo.User;

import java.util.List;

public interface UserService {
    List<User> getUserList();
    User getUserInfoById();

    boolean verifyUserLogin(User user);
}
