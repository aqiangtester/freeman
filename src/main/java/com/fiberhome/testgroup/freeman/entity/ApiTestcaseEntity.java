package com.fiberhome.testgroup.freeman.entity;

/**
 * @program: freeman
 * @description: 每个接口的测试用例表
 * @author: tianyq
 * @create: 2020-03-10 17:54
 **/

public class ApiTestcaseEntity {

    private Integer id;
    private String title;
    private String url;
    private String requestParams;
    private String requestBody;

    public ApiTestcaseEntity() {
    }

    public ApiTestcaseEntity(Integer id, String title, String url, String requestParams, String requestBody) {
        this.id = id;
        this.title = title;
        this.url = url;
        this.requestParams = requestParams;
        this.requestBody = requestBody;
    }

    @Override
    public String toString() {
        return "ApiTestcaseEntity{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", requestParams='" + requestParams + '\'' +
                ", requestBody='" + requestBody + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getRequestParams() {
        return requestParams;
    }

    public void setRequestParams(String requestParams) {
        this.requestParams = requestParams;
    }

    public String getRequestBody() {
        return requestBody;
    }

    public void setRequestBody(String requestBody) {
        this.requestBody = requestBody;
    }
}
