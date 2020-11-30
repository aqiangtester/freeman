package com.fiberhome.testgroup.freeman.service;

import com.fiberhome.testgroup.freeman.entity.EnvEntity;
import com.fiberhome.testgroup.freeman.response.ResponseData;

import java.io.FileNotFoundException;

public interface EnvService {

    void insertEnv(EnvEntity envEntity);

    void updateEnv(EnvEntity envEntity);

    void deleteEnv(String envId);

    EnvEntity getEnvByEnvName(String envName);

    EnvEntity getEnvByEnvId(String envId);
}
