package com.fiberhome.testgroup.freeman.entity;

public class EnvEntity {

    private String envId;
    private String envName;
    private String envIp;
    private String envPort;

    public EnvEntity(String envId, String envName, String envIp, String envPort) {
        this.envId = envId;
        this.envName = envName;
        this.envIp = envIp;
        this.envPort = envPort;
    }

    public String getEnvId() {
        return envId;
    }

    public void setEnvId(String envId) {
        this.envId = envId;
    }

    public String getEnvName() {
        return envName;
    }

    public void setEnvName(String envName) {
        this.envName = envName;
    }

    public String getEnvIp() {
        return envIp;
    }

    public void setEnvIp(String envIp) {
        this.envIp = envIp;
    }

    public String getEnvPort() {
        return envPort;
    }

    public void setEnvPort(String envPort) {
        this.envPort = envPort;
    }

    @Override
    public String toString() {
        return "EnvEntity{" +
                "envId='" + envId + '\'' +
                ", envName='" + envName + '\'' +
                ", envIp='" + envIp + '\'' +
                ", envPort='" + envPort + '\'' +
                '}';
    }
}
