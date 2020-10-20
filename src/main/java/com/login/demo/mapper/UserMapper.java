package com.login.demo.mapper;

import com.login.demo.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    public List<User> getUserList();

    public  User getUserInfoById();
}
