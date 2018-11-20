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
        User user  = mybatisApp.findUserById(1);
        if (user!=null){
            System.out.println("姓名："+user.getU_name()+",年龄"+user.getAge());
        }
        else {
            System.out.println("没有该用户");
        }

    }
    @Test
    public void delUserById(){
        int result=0;
            result = mybatisApp.delUserById(1);
        if (result>0){
            System.out.println("删除成功！");
        }
        else {
            System.out.println("没有找到该用户！");
        }
    }
    @Test
    public void  insertUser(){
        int result = 0 ;
        User user =new User();
        user.setU_name("renl88");
        user.setPassword("1230");
        user.setAge(18);
        result = mybatisApp.insertUser(user);
        if (result>0){
            System.out.println("插入成功！");
        }
        else {
            System.out.println("插入数据有误！");
        }
    }
    @Test
    public  void  modifyUserById(){
        int result = 0 ;
        User user =new User();
        user.setU_name("rn");
        user.setPassword("123");
        user.setAge(28);
        user.setId((long)3);
        result = mybatisApp.modifyUserById(user);
        if (result>0){
            System.out.println("修改成功！");
        }
        else {
            System.out.println("修改数据有误！");
        }
    }





}