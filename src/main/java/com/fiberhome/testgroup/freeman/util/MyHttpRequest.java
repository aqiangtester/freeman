package com.fiberhome.testgroup.freeman.util;

import com.fiberhome.testgroup.freeman.exception.MyException;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

/**
 * @program: freeman
 * @description: 使用restTemplate的http模板请求
 * @author: tianyq
 * @create: 2020-03-11 17:20
 **/

public class MyHttpRequest {

//    private static RestTemplate restTemplate;
//
//    @Resource
//    public void setRestTemplate(RestTemplate restTemplate){
//        this.restTemplate = restTemplate;
//    }

    RestTemplate restTemplate;

    public MyHttpRequest() {
        restTemplate = new RestTemplate();
    }

    /**
     *
     * @param url
     * @param method
     * @param cookie
     * @param requestParams
     * @return 发送http请求的方法，直接返回响应信息的body
     */
    public static String sendHttpRequest(String url, HttpMethod method, String cookie, Map<String, Object> requestParams){
        MyHttpRequest myHttpRequest = new MyHttpRequest();
        ResponseEntity<String> responseEntity = myHttpRequest.send(url, method, cookie, requestParams);
        return myHttpRequest.getResponseBody(responseEntity);
    }

    /**
     *
     * @param url
     * @param method
     * @param requestParams
     * @return 获取响应信息的header中的cookie（实际使用中调用登录接口获取下发的cookie）
     */
    public static String getResponseHeaderCookie(String url, HttpMethod method, Map<String, Object> requestParams){
        String cookie_str = new MyHttpRequest().send(url, method, requestParams).getHeaders().get("set-cookie").get(0);
        return cookie_str.substring(0, cookie_str.indexOf(";"));        //从前往后第一个出现的“;”，截取此分号之前的字符串
    }

    /**
     *
     * @param url
     * @param method
     * @param cookie
     * @param requestParams
     * @return
     */
    private ResponseEntity<String> send(String url, HttpMethod method, String cookie, Map<String, Object> requestParams) {
        HttpEntity<Map<String, Object>> requestEntity = new HttpEntity<Map<String, Object>>(requestParams, setHeaders(cookie));
        ResponseEntity<String> exchange = restTemplate.exchange(url, method, requestEntity, String.class);
        return exchange;
    }

    /**
     *
     * @param url
     * @param method
     * @param requestParams
     * @return 获取响应信息的header中的cookie（实际使用中调用登录接口获取下发的cookie）
     */
    private ResponseEntity<String> send(String url, HttpMethod method, Map<String, Object> requestParams) {
        HttpEntity<Map<String, Object>> requestEntity = new HttpEntity<Map<String, Object>>(requestParams, setHeaders());
        ResponseEntity<String> exchange = restTemplate.exchange(url, method, requestEntity, String.class);
        return exchange;
    }

    /**
     *
     * @param responseEntity
     * @return 根据响应的responseEntity获取body
     */
    private String getResponseBody(ResponseEntity<String> responseEntity){
        return responseEntity.getBody();
    }


    /**
     *
     * @param cookie
     * @return HttpHeaders
     * @throws MyException
     * @description 1.设置请求头的contentType为Json，2.设置cookie
     */
    private HttpHeaders setHeaders(String cookie) throws MyException{
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        if (null == cookie || "".equals(cookie)){
            throw new MyException("cookie为空");
        }
        httpHeaders.add("Cookie", cookie);
        return httpHeaders;
    }

    /**
     *
     * @return HttpHeaders
     * @description 1.设置请求头的contentType为Json
     */
    private HttpHeaders setHeaders(){
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        return httpHeaders;
    }
}

