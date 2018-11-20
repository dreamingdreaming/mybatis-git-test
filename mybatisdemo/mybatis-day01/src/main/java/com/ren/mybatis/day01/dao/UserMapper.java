package com.ren.mybatis.day01.dao;

import com.ren.mybatis.day01.domain.User;

import java.util.List;

public interface UserMapper {
    /**
     * 查询user表所有
     */
    public List<User> findAll();
    public User findUserById(int id);
    public int delUserById(int id);
    public int insertUser(User user);
    public int modifyUserById(User user);
}
