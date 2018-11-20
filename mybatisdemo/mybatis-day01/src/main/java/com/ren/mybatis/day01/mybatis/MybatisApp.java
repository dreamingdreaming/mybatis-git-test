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
public class MybatisApp{
    String resource = "mybatis-config.xml";
    private SqlSessionFactory sqlSessionFactory;
    public List<User> findAll() {
        List<User> userList;
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
        //获得接口的代理人的实现类
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        userList = mapper.findAll();
        sqlSession.close();
        return userList;
    }

        public User findUserById(int id){
        User user;
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        user = sqlSession.selectOne("com.ren.mybatis.day01.dao.UserMapper.findUserById",id);
        sqlSession.close();
        return user;
    }
    public int delUserById(int id){
        int result = 0;
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        result = sqlSession.delete("com.ren.mybatis.day01.dao.UserMapper.delUserById",id);
        sqlSession.commit();
        sqlSession.close();
        return result;
    }
    public int insertUser(User user){
        int result = 0;
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        result = sqlSession.insert("com.ren.mybatis.day01.dao.UserMapper.insertUser",user);
        sqlSession.commit();
        sqlSession.close();
        return result;
    }
    public int modifyUserById(User user){
        int result = 0;
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        result = sqlSession.insert("com.ren.mybatis.day01.dao.UserMapper.modifyUserById",user);
        sqlSession.commit();
        sqlSession.close();
        return result;
    }



}
