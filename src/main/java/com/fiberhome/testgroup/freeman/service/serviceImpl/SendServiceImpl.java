package com.fiberhome.testgroup.freeman.service.serviceImpl;

import com.fiberhome.testgroup.freeman.response.ResponseData;
import com.fiberhome.testgroup.freeman.service.SendService;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @program: freeman
 * @description:
 * @author: tianyq
 * @create: 2020-03-10 20:04
 **/
@Service
public class SendServiceImpl implements SendService {

    @Override
    public ResponseData send(String title, String httpType, String ip, String uri, Map<String, Object> postParams, Object... uriVariables) {
        return null;
    }
}
