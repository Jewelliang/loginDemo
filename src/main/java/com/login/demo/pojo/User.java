package com.login.demo.pojo;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
public class User {
        int rowId;
        int userId;
        String userName;
        String phone;
        String email;
        String role;
        Date createDate;
        String createBy;
        Date updateDate;
        String updateBy;
        String  isDeleted;
}
