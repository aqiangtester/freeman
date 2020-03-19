package com.fiberhome.testgroup.freeman.constant;

/**
 * @program: freeman
 * @description: 统一的响应code及message封装
 * @author: tianyq
 * @create: 2020-03-09 16:13
 **/

public enum ResponseCode {

    SUCCESS(200, "操作成功"),
    REQUEST_ERROR(400, "请求参数错误"),
    FAIL(-1, "操作失败");

    private int code;
    private String message;

    ResponseCode() {
    }

    ResponseCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
