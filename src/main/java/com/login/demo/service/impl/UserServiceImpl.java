package com.login.demo.service.impl;

import com.login.demo.mapper.UserMapper;
import com.login.demo.pojo.User;
import com.login.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    public UserMapper userMapper;

    @Override
    public List<User> getUserList() {
        return userMapper.getUserList();
    }

    @Override
    public User getUserInfoById() {
        return userMapper.getUserInfoById();
    }

    @Override
    public boolean verifyUserLogin(User user) {
        return true;
    }
}
