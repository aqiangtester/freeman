package com.fiberhome.testgroup.freeman.controller;

import com.fiberhome.testgroup.freeman.constant.ResponseCode;
import com.fiberhome.testgroup.freeman.entity.SendHttpRequestEntity;
import com.fiberhome.testgroup.freeman.exception.MyException;
import com.fiberhome.testgroup.freeman.response.ResponseData;
import com.fiberhome.testgroup.freeman.util.RestTemplateHttp;
import com.fiberhome.testgroup.freeman.service.serviceImpl.SendServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: freeman
 * @description:
 * @author: tianyq
 * @create: 2020-03-10 20:26
 **/
@RestController
@RequestMapping("/send")
public class SendController {

    @Autowired
    SendServiceImpl sendService;

    @PostMapping("/my")
    public ResponseData send(@RequestBody SendHttpRequestEntity sendHttpRequestEntity){

        if (sendHttpRequestEntity.getHttpType() == null || "".equals(sendHttpRequestEntity.getHttpType())) {
            throw new MyException(ResponseCode.REQUEST_ERROR.getCode(), "请求类型为空");
        }
        String res = RestTemplateHttp.send(sendHttpRequestEntity.getHttpType(), sendHttpRequestEntity.getIp(), sendHttpRequestEntity.getUri(), sendHttpRequestEntity.getPostParams());
        return ResponseData.success(res);
    }
}
