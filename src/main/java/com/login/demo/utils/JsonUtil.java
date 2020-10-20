package com.login.demo.utils;

import org.springframework.format.annotation.DateTimeFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class JsonUtil {

    public static JsonResult retSuccess(String message){
        JsonResult jsonResult = new JsonResult();
        jsonResult.setTimeStamp(DateUtils.getDateTime());
        jsonResult.setCode(200);
        jsonResult.setMessage(message);
        return jsonResult;
    }

    public static JsonResult retSuccess(String message, Object data){
        JsonResult jsonResult = new JsonResult();
        jsonResult.setTimeStamp(DateUtils.getDateTime());
        jsonResult.setCode(200);
        jsonResult.setMessage(message);
        jsonResult.setData(data);
        return jsonResult;
    }
}
