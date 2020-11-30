package com.fiberhome.testgroup.freeman.mapper;

import com.fiberhome.testgroup.freeman.entity.EnvEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface EnvMapper {

    //添加环境
    void insertEnv(EnvEntity envEntity);

    //删除环境
    void deleteEnv(String envId);

    //修改环境
    void updateEnv(EnvEntity envEntity);

    //根据名称查找环境
    EnvEntity getEnvByEnvName(String envName);

    //根据envId查找环境
    EnvEntity getEnvByEnvId(String envId);

}
