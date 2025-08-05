package com.example.demo.service;

import com.example.demo.pojo.User;
import com.example.demo.pojo.dto.UserDto;

public interface IUserService {
    /*
    插入用户
    @param user 参数
    @return
     */
    User add(UserDto user);

    /*
    查询用户
    @param useId 用户Id
    @return
     */
    User getUser(Long userId);

    /*
    修改用户
    @param user 修改用户对象
    @return
     */
    User edit(UserDto user);

    void delete(Long userId);
    /*
    删除用户
    @param user 删除用户
    @return
     */

}
