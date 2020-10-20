package com.login.demo.enumeration;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResponseEnum {


    BAD_LICENCE_TYPE(7001, "Bad licence type."),

    LICENCE_NOT_FOUND(7002, "Licence not found.")
    ;

    private int code;

    private String message;


    public int getCode() {
        return 0;
    }

    public String getMessage() {
        return null;
    }
}
