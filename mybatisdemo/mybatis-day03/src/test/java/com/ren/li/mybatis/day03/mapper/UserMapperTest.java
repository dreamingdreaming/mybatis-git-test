package com.ren.li.mybatis.day03.mapper;

import com.ren.li.mybatis.day03.pojo.User;
import com.ren.li.mybatis.day03.uitl.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class UserMapperTest {

    @Test
    public void selectAll() {
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtil.createFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.selectAll();
        for (User user : users) {
            System.out.println(user);
        }
    }
}