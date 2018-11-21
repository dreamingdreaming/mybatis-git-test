package com.ren.li.mybatis.day03.mapper;

import com.ren.li.mybatis.day03.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> selectAll();

}
