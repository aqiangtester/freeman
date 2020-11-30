package com.fiberhome.testgroup.freeman.entity;

import java.util.Map;

/**
 * @program: freeman
 * @description:
 * @author: tianyq
 * @create: 2020-03-13 20:24
 **/
public class SendHttpRequestEntity {
    private String title;
    private String httpType;
    private String ip;
    private String uri;
    private Map<String, Object> requestParams;

    @Override
    public String toString() {
        return "SendHttpRequestEntity{" +
                "title='" + title + '\'' +
                ", httpType='" + httpType + '\'' +
                ", ip='" + ip + '\'' +
                ", uri='" + uri + '\'' +
                ", requestParams=" + requestParams +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHttpType() {
        return httpType;
    }

    public void setHttpType(String httpType) {
        this.httpType = httpType;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public Map<String, Object> getRequestParams() {
        return requestParams;
    }

    public void setRequestParams(Map<String, Object> requestParams) {
        this.requestParams = requestParams;
    }

    public SendHttpRequestEntity(String title, String httpType, String ip, String uri, Map<String, Object> requestParams) {
        this.title = title;
        this.httpType = httpType;
        this.ip = ip;
        this.uri = uri;
        this.requestParams = requestParams;
    }
}
