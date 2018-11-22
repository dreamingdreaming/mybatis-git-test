package com.ren.li.mybatis.day04.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * 工具类
 *
 * @author renl
 * @date 2018-11-20
 */
public class SqlSessionFactoryUtil {
    static String resource = "mybatis-config.xml";
    private static SqlSessionFactory sqlSessionFactory;
    public static SqlSessionFactory createFactory(){
        InputStream inputStream;
        {
            try {
                inputStream = Resources.getResourceAsStream(resource);
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return sqlSessionFactory;
    }



}
