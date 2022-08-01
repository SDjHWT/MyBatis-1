package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;

import java.util.List;

public interface UserMapper {
    /**
     * Mybatis 的映射文件的两个一致
     * 1、映射文件的namespace要和mapper接口的全类名保持一致
     * 2、映射文件中Sql语句的ID要和mapper接口中的方法名一致
     */
    /**
     * 添加用户信息
     */
    int insertUser();
    /**
     * 修改用户信息
     */
    int updateUser();
    /**
     * 删除用户信息
     */
    int deleteUser();
    /**
     * 根据id查询用户信息
     */
    User getUserById();
    /**
     * 查询所有用户信息
     */
    List<User> gitAllUser();

}
