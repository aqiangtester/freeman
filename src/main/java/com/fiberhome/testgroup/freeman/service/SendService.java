package com.fiberhome.testgroup.freeman.service;

import com.fiberhome.testgroup.freeman.response.ResponseData;

import java.util.Map;

/**
 * @program: freeman
 * @description:
 * @author: tianyq
 * @create: 2020-03-10 20:03
 **/
public interface SendService {

    ResponseData send(String title, String httpType, String ip, String uri, Map<String, Object> postParams, Object...uriVariables);

}
