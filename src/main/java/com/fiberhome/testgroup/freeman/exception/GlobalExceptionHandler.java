package com.fiberhome.testgroup.freeman.exception;

import com.fiberhome.testgroup.freeman.constant.ResponseCode;
import com.fiberhome.testgroup.freeman.response.ResponseData;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @program: freeman
 * @description: 捕获controller层的全局统一异常处理类
 * @author: tianyq
 * @create: 2020-03-10 12:52
 **/
@RestControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 捕获全局异常
     * @param e
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    public ResponseData globalExceptionHandler(Exception e){
        return ResponseData.build(ResponseCode.FAIL.getCode(),e.getMessage());
    }

    /**
     * 捕获自定义异常
     * @param e
     * @return
     */
    @ExceptionHandler(value = MyException.class)
    public ResponseData myExceptionHandler(MyException e){
        return ResponseData.build(e.getCode(), e.getMessage());
    }

}
