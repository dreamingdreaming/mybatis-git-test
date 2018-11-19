package com.ren.mybatis.day01.jdbc;

import com.ren.mybatis.day01.domain.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * JDBC的实例类
 */
public class JDBCApp {
    final String url = "jdbc:mysql://localhost:3306/mybatistest";

    final String username = "root";

    final String password="123";

    private Connection connection;


    //代码块
    {
        try {
            //加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //创建连接
            connection =  DriverManager.getConnection(url,username,password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param user   需要的传的参数
     * @return       返回的行数
     */
    public int addUser(User user) throws SQLException {
        int result = 0;
        try {
            String sql = "insert into user(id,u_name,age) value (0,?,?)";
            //创建通道
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            //把需要存入的值和列一一对应
            preparedStatement.setObject(1,user.getU_name());
            preparedStatement.setObject(2,user.getAge());
            //执行sql语句,并返回影响的行数
            result = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            connection.close();
        }
        return result;
    }

    public List<User> findAll() {
        List<User> userList = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement("select *from user");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                User user = new User();
                user.setId((resultSet.getLong(1)));
                user.setU_name(resultSet.getString(2));
                user.setPassword(resultSet.getString(3));
                user.setAge(resultSet.getInt(4));
                userList.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userList;
    }
}
