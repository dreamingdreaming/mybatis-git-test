package com.ren.li.mybatis.day04.util;

import com.ren.li.mybatis.day04.mapper.UserMapper;
import com.ren.li.mybatis.day04.pojo.User;
import com.ren.li.mybatis.day04.util.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class UserMapperTest {
    SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtil.createFactory();


    @Test
    public void selectUserByNameOrAge() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.selectUserByNameOrAge("renl", 16);
        for (User user : userList) {
            System.out.println(user);
        }

        sqlSession.close();
    }
    @Test
    public  void  getUserByIds(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setIds(Arrays.asList(3,6,8));
        List<User> userByIds = mapper.getUserByIds(user);
        for (User userById : userByIds) {
            System.out.println(userById);
        }
        sqlSession.close();
    }
}