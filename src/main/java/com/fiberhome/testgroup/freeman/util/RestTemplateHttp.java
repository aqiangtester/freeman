package com.fiberhome.testgroup.freeman.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

/**
 * @program: freeman
 * @description: 使用restTemplate的http模板请求
 * @author: tianyq
 * @create: 2020-03-11 17:20
 **/

public class RestTemplateHttp {

    @Autowired
    private RestTemplate restTemplate;

    public RestTemplateHttp() {
    }

    public static String send(String httpType, String ip,
                              String uri, Map<String, Object> postParams,
                              Object...uriVariables) {
        return new RestTemplateHttp().sendRequest(httpType, ip, uri, postParams, uriVariables);
    }

    private String sendRequest(String httpType, String ip,
                        String uri, Map<String, Object> postParams,
                        Object...uriVariables){
        String url = ip + uri;
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Cookie","JSESSIONID=YWVmMDE5ODAtNGRjOS00MzM0LTlmMmQtZDQ2ZWMwNzA3NmVi");
        if (httpType.equalsIgnoreCase("get")){
            return restTemplate.getForObject(url, String.class, uriVariables);
        }else if (httpType.equalsIgnoreCase("post")){

            httpHeaders.setContentType(MediaType.APPLICATION_JSON);
            HttpEntity<Map<String, Object>> request = new HttpEntity<Map<String, Object>>(postParams, httpHeaders);
            return restTemplate.postForObject(url, request, String.class, uriVariables);
        }
        return "";
    }

    public static String getResponseCookie(String httpType, String ip,
                                           String uri, Map<String, Object> postParams,
                                           Object...uriVariables){
        String res = send(httpType, ip, uri, postParams, uriVariables);

        return "";

    }

}
