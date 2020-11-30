package com.fiberhome.testgroup.freeman.response;

import com.fiberhome.testgroup.freeman.constant.ResponseCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: freeman
 * @description: 统一的响应结果封装
 * @author: tianyq
 * @create: 2020-03-09 19:52
 **/
public class ResponseData {

    private Integer code;
    private String message;
    private Object data;

    /**
     *
     * @return  操作成功返回data为空
     */
    public static ResponseData success(){
        return new ResponseData();
    }

    /**
     *
     * @param data
     * @return  操作成功返回的data，data不为空
     */
    public static ResponseData success(Object data){
        return new ResponseData(data);
    }

    /**
     *
     * @param code
     * @param message
     * @return  操作失败
     */
    public static ResponseData build(Integer code, String message){
        return new ResponseData(code, message);
    }

    /**
     *
     * @param code
     * @param message
     * @param data
     * @return  操作失败，含具体错误内容
     */
    public static ResponseData build(Integer code, String message, Object data) {
        return new ResponseData(code, message, data);
    }

    public ResponseData() {
        this.code = ResponseCode.SUCCESS.getCode();
        this.message = ResponseCode.SUCCESS.getMessage();
    }

    public ResponseData(Object data) {
        this.code = ResponseCode.SUCCESS.getCode();
        this.message = ResponseCode.SUCCESS.getMessage();
        this.data = data;
    }

    public ResponseData(Integer code, String message) {
        this.code = code;
        this.message = message;
        this.data = new ArrayList<>();
    }

    public ResponseData(Integer code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResponseData{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
