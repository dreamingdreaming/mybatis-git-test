package com.ren.li.mybatis.day02.mapper;

import com.ren.li.mybatis.day02.util.SqlSessionFactoryUtil;
import com.ren.li.mybatis.day02.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {
    SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtil.createFactory();

    @Test
    public void selectAll() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.selectAll();
        for (User user : users) {
            System.out.println(user.getU_name());
        }
        sqlSession.close();
    }

    @Test
    public void selectById() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.selectById(3L);
        if (user!=null)
        {
            System.out.println(user.getU_name());
        }
        else {
            System.out.println("没有这个用户！");
        }
        sqlSession.close();
    }

    @Test
    public void insertUser() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setU_name("lala");
        user.setPassword("45612");
        user.setAge(13);
        int i = mapper.insertUser(user);
        sqlSession.commit();
        if (i>0){
            System.out.println("插入成功！");
        }
        else {
            System.out.println("插入失败！");
        }

        sqlSession.close();
    }

    @Test
    public void update() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setU_name("baba");
        user.setPassword("123456");
        user.setAge(13);
        user.setId(3L);
        int i = mapper.update(user);
        sqlSession.commit();
        if (i>0){
            System.out.println("更新成功！");
        }
        else {
            System.out.println("更新失败！");
        }

        sqlSession.close();
    }

    @Test
    public void delUserById() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int r = mapper.delUserById(3L);
        sqlSession.commit();
        if (r>0){
            System.out.println("删除成功！");
        }
        else {
            System.out.println("删除失败！");
        }
        sqlSession.close();

    }
}