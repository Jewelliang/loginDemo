package com.login.demo.utils;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
public class JsonResult {
    int code;
    String message;
    String timeStamp;
    Object data;

}
