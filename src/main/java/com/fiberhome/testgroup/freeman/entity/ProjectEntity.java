package com.fiberhome.testgroup.freeman.entity;

import lombok.Data;

@Data
public class ProjectEntity {

    private Integer projectId;
    private String projectName;
    private String projectCode;
    private String projectDetail;
    private String projectTestLeader;

    public ProjectEntity() {
    }

    public ProjectEntity(Integer projectId, String projectName, String projectCode, String projectDetail, String projectTestLeader) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.projectCode = projectCode;
        this.projectDetail = projectDetail;
        this.projectTestLeader = projectTestLeader;
    }

    @Override
    public String toString() {
        return "ProjectEntity{" +
                "projectId=" + projectId +
                ", projectName='" + projectName + '\'' +
                ", projectCode='" + projectCode + '\'' +
                ", projectDetail='" + projectDetail + '\'' +
                ", projectTestLeader='" + projectTestLeader + '\'' +
                '}';
    }
}
