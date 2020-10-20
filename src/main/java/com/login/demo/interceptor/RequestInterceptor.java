package com.login.demo.interceptor;

import com.login.demo.utils.SysConfigUtil;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StreamUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

@Slf4j
public class RequestInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        String url = request.getRequestURI();
        System.out.println("request Uri = " +url);
        StringBuffer URL = request.getRequestURL();
        System.out.println("request URL = " +URL);
        String ip = SysConfigUtil.getIpAddress(request);
        System.out.println("request Ip = "+ ip);

        //获取请求参数
        String queryString = request.getQueryString();
        if(queryString != null && !"".equals(queryString)) {
            log.info("请求参数:{}", queryString);
        }

        //获取请求body
        byte[] bodyBytes = StreamUtils.copyToByteArray(request.getInputStream());
        if(bodyBytes.length > 1) {
            String body = new String(bodyBytes, request.getCharacterEncoding());
            log.info("请求体：{}", body);
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {


    }
}
