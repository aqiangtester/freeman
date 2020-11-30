package com.fiberhome.testgroup.freeman.service;

import com.fiberhome.testgroup.freeman.entity.UserEntity;

public interface UserService {

    UserEntity getUserByUserId(String userId);

    UserEntity getUserByUserNameAndPassword(String userName, String password);

    void insertUser(UserEntity userEntity);

    void updateUser(UserEntity userEntity);

    void deleteUser(String userId);

}
