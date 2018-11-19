package com.ren.mybatis.day01.jdbc;

import com.ren.mybatis.day01.domain.User;
import org.junit.Assert;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;

public class JDBCAppTest {
    JDBCApp jdbcApp = new JDBCApp();

    @Test
    public void addUser() throws SQLException {
        User user = new User();
        user.setU_name("renl3");
        user.setAge(16);
        int i = jdbcApp.addUser(user);
        Assert.assertEquals(1,i);
    }
    @Test
    public void  findAll() {
        List<User> userList = jdbcApp.findAll();
        for (User user : userList) {
            System.out.println("姓名为："+user.getU_name()+"年龄为："+user.getAge());
        }
    }
}