package com.fiberhome.testgroup.freeman.exception;

/**
 * @program: freeman
 * @description: 自定义异常处理类
 * @author: tianyq
 * @create: 2020-03-10 12:38
 **/
public class MyException extends RuntimeException{

    private Integer code;
    private String message;

    public MyException() {
    }

    public MyException(String message) {
        this.message = message;
    }

    public MyException(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
