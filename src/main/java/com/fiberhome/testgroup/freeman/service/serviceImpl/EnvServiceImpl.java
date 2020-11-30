package com.fiberhome.testgroup.freeman.service.serviceImpl;

import com.fiberhome.testgroup.freeman.entity.EnvEntity;
import com.fiberhome.testgroup.freeman.mapper.EnvMapper;
import com.fiberhome.testgroup.freeman.service.EnvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnvServiceImpl implements EnvService {

    @Autowired
    private EnvMapper envMapper;

    @Override
    public void insertEnv(EnvEntity envEntity){
        envMapper.insertEnv(envEntity);
    }

    @Override
    public void updateEnv(EnvEntity envEntity) {
        envMapper.updateEnv(envEntity);
    }

    @Override
    public void deleteEnv(String envId) {
        envMapper.deleteEnv(envId);
    }

    @Override
    public EnvEntity getEnvByEnvName(String envName) {
        return envMapper.getEnvByEnvName(envName);
    }

    @Override
    public EnvEntity getEnvByEnvId(String envId) {
        return envMapper.getEnvByEnvId(envId);
    }
}
