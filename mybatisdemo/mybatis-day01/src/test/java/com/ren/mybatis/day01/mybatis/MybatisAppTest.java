package com.ren.mybatis.day01.mybatis;

import com.ren.mybatis.day01.domain.User;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.*;



public class MybatisAppTest {
    MybatisApp mybatisApp = new MybatisApp();

    @Test
    public void findAll() {
        List<User> userList = mybatisApp.findAll();
        if (userList.size()>0){
            for (User user : userList) {
                System.out.println("姓名："+user.getU_name()+",年龄"+user.getAge());
            }
        }
        else {
            System.out.println("这是一个空列表");
        }

    }
    @Test
    public void findUserById(){
        User user  = mybatisApp.findUserById(10);
        if (user!=null){
            System.out.println("姓名："+user.getU_name()+",年龄"+user.getAge());
        }
        else {
            System.out.println("没有该用户");
        }

    }


}