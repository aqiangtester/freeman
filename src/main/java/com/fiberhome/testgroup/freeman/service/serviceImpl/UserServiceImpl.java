package com.fiberhome.testgroup.freeman.service.serviceImpl;

import com.fiberhome.testgroup.freeman.entity.UserEntity;
import com.fiberhome.testgroup.freeman.mapper.UserMapper;
import com.fiberhome.testgroup.freeman.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserEntity getUserByUserId(String userId) {
        return userMapper.getUserByUserId(userId);
    }

    @Override
    public UserEntity getUserByUserNameAndPassword(String userName, String password) {
        return userMapper.getUserByUserNameAndPassword(userName, password);
    }

    @Override
    public void insertUser(UserEntity userEntity) {
        userMapper.insertUser(userEntity);
    }

    @Override
    public void updateUser(UserEntity userEntity) {
        userMapper.updateUser(userEntity);
    }

    @Override
    public void deleteUser(String userId) {
        userMapper.deleteUser(userId);
    }
}
