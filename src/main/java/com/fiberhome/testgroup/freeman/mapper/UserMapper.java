package com.fiberhome.testgroup.freeman.mapper;

import com.fiberhome.testgroup.freeman.entity.UserEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    //添加用户
    void insertUser(UserEntity userEntity);

    //删除用户
    void deleteUser(String userId);

    //修改用户
    void updateUser(UserEntity userEntity);

    //通过用户id查询用户
    UserEntity getUserByUserId(String userId);

    //通过用户名和密码查询用户
    UserEntity getUserByUserNameAndPassword(String userName, String password);

    //查询用户列表，分页
    List<UserEntity> getUserList(@Param("userCondition") UserEntity userCondition, @Param("rowIndex") int rowIndex,
                                 @Param("pageSize") int pageSize);

    //查询用户数量
    int getUserCount(@Param("userCondition") UserEntity userCondition);
}
