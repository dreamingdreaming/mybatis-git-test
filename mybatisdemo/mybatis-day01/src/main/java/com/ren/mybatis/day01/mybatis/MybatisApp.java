package com.ren.mybatis.day01.mybatis;

import com.ren.mybatis.day01.dao.UserMapper;
import com.ren.mybatis.day01.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;


/**
 * renl
 *
 * @author renl
 * @date 2018-11-19
 */
public class MybatisApp {
    private SqlSessionFactory sqlSessionFactory;
    public List<User> findAll() {
        List<User> userList;
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //第一种方式
        //userList = ((SqlSession) sqlSession).selectList("com.ren.mybatis.day01.dao.UserMapper.findAll");
        //第二种方式
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        userList = mapper.findAll();
        return userList;
    }

        public User findUserById(int id){
        User user;
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        user = ((SqlSession) sqlSession).selectOne("com.ren.mybatis.day01.dao.UserMapper.findUserById",id);

        return user;
    }


}
