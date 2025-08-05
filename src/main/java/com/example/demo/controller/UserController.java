package com.example.demo.controller;

import com.example.demo.pojo.ResponseMessage;
import com.example.demo.pojo.User;
import com.example.demo.pojo.dto.UserDto;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController //返回对象
@RequestMapping("/user") //localhost:8088/user/**
public class UserController {
    @Autowired
    IUserService userService;

    //增加
    @PostMapping  //URL:localhost:8088/user   method:post

    public ResponseMessage add(@Validated  @RequestBody UserDto user) {
        User userNew=userService.add(user);
        return ResponseMessage.success(userNew);
    }

    //查询
    @GetMapping("/{userId}")    //URL:localhost:8088/user/1   method:get
    public ResponseMessage get(@PathVariable Long userId) {
        User userNew = userService.getUser(userId);
        return ResponseMessage.success(userNew);
    }
    //修改
    @PutMapping
    public ResponseMessage edit(@Validated  @RequestBody UserDto user) {
        User userNew=userService.edit(user);
        return ResponseMessage.success(userNew);
    }
    //删除
    @DeleteMapping("/{userId}")
    public ResponseMessage delete(@PathVariable Long userId) {
        userService.delete(userId);
        return ResponseMessage.success();
    }


};
