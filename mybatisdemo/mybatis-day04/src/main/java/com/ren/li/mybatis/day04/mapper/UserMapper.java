package com.ren.li.mybatis.day04.mapper;

import com.ren.li.mybatis.day04.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    List<User> selectUserByNameOrAge(@Param("u_name") String name,@Param("age") int age);
    List<User> getUserByIds(User user);
}
