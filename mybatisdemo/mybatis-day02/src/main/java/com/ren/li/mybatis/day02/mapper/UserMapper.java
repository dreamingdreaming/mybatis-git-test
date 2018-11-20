package com.ren.li.mybatis.day02.mapper;

import com.ren.li.mybatis.day02.pojo.User;

import java.util.List;

/**
 * 用户映射接口
 *
 */
public interface UserMapper {
    /**
     * 查询所有数据
     * @return 数据的集合
     */
    List<User> selectAll();

    /**
     * 根据ID查询用户信息
     * @param id 用户的ID
     * @return  用户的信息
     */
    User selectById(Long id);

    /**
     * 插入数据
     *
     * @param user  需要插入的数据对象
     * @return 插入操作影响的行数
     */
    int insertUser(User user);

    /**
     * 根据ID修改数据
     * @param user 需要修改的数据
     * @return 修改操作影响的行数
     */
    int update(User user);

    /**
     * 根据ID删除用户数据
     * @param id 用户的ID
     * @return 删除操作影响的行数
     */
    int delUserById(Long id);

}
