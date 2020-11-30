package com.fiberhome.testgroup.freeman.controller;

import com.fiberhome.testgroup.freeman.constant.ResponseCode;
import com.fiberhome.testgroup.freeman.entity.UserEntity;
import com.fiberhome.testgroup.freeman.exception.MyException;
import com.fiberhome.testgroup.freeman.response.ResponseData;
import com.fiberhome.testgroup.freeman.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUser/{userId}")
    public ResponseData getUser(@PathVariable String userId){
        return ResponseData.success(userService.getUserByUserId(userId));
    }

    @PostMapping("/register")
    public ResponseData register(@RequestBody UserEntity userEntity){
        UserEntity user = userService.getUserByUserId(userEntity.getUserId());
        if (user != null){
            throw new MyException(ResponseCode.FAIL.getCode(), "账号已存在");
        }
        userService.insertUser(userEntity);
        return ResponseData.success();
    }

    @PostMapping("/login")
    public ResponseData login(@RequestBody UserEntity userEntity){
        String userName = userEntity.getUserName();
        String password = userEntity.getPassword();
        if (null == userName || "".equals(userName)){
            throw new MyException(ResponseCode.FAIL.getCode(), "用户名为空");
        }
        if (null == password || "".equals(password)){
            throw new MyException(ResponseCode.FAIL.getCode(), "密码为空");
        }
        UserEntity user = userService.getUserByUserNameAndPassword(userName, password);
        if (null == user){
            throw new MyException(ResponseCode.FAIL.getCode(), "用户名或者密码错误");
        }
        return ResponseData.success(user);
    }

}
