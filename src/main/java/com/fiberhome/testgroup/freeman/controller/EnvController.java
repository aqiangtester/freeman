package com.fiberhome.testgroup.freeman.controller;

import com.fiberhome.testgroup.freeman.constant.ResponseCode;
import com.fiberhome.testgroup.freeman.entity.EnvEntity;
import com.fiberhome.testgroup.freeman.exception.MyException;
import com.fiberhome.testgroup.freeman.response.ResponseData;
import com.fiberhome.testgroup.freeman.service.EnvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/env")
public class EnvController {

    @Autowired
    private EnvService envServiceImpl;

    @PostMapping("/add")
    public ResponseData addEnv(@RequestBody EnvEntity envEntity) {
        if (null != envEntity.getEnvName() && !"".equals(envEntity.getEnvName().trim())) {
            if (null != envServiceImpl.getEnvByEnvName(envEntity.getEnvName())) {
                throw new MyException(ResponseCode.FAIL.getCode(), "该环境名称已存在");
            } else {
                envServiceImpl.insertEnv(envEntity);
                return ResponseData.success();
            }
        }
        throw new MyException(ResponseCode.FAIL.getCode(), "环境名称不能为空");
    }

    @PostMapping("/update")
    public ResponseData updateEnv(@RequestBody EnvEntity envEntity) {
        if (null != envEntity.getEnvName() && !"".equals(envEntity.getEnvName().trim())) {
            if (null != envServiceImpl.getEnvByEnvName(envEntity.getEnvName())) {
                if (envServiceImpl.getEnvByEnvId(envEntity.getEnvId()).getEnvName().equals(envEntity.getEnvName().trim())){
                    envServiceImpl.updateEnv(envEntity);
                    return ResponseData.success();
                }else {
                    throw new MyException(ResponseCode.FAIL.getCode(), "环境名称已存在");
                }
            } else {
                envServiceImpl.insertEnv(envEntity);
                return ResponseData.success();
            }
        }
        throw new MyException(ResponseCode.FAIL.getCode(), "环境名称不能为空");
    }

    @PostMapping("/delete")
    public ResponseData deleteEnv(@RequestBody String envId) {
        envServiceImpl.deleteEnv(envId);
        return ResponseData.success();
    }

}
