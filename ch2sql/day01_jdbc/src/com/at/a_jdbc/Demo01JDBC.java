package com.at.a_jdbc;

import com.mysql.cj.jdbc.Driver;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo01JDBC {
    @Test
    public void insert() throws Exception{
        // 1. 注册驱动
        // DriverManager.registerDriver(new Driver());
        Class.forName("com.mysql.cj.jdbc.Driver");
        // 2. 获取链接
        String url = "jdbc:mysql://localhost:3306/ntest";
        String name = "root";
        String pwd = "xxxx"; // 这个肯定不是真实的密码，需要根据自己修改
        // 我自己的密码是最常用密码全小写无后缀版本
        Connection connection =  DriverManager.getConnection(url, name, pwd);
        System.out.println("connection = " + connection);

        // 3. 准备sql
        String sql = "insert into user (username, password) values('tom', '111')";

        /**
         * 4. 获取执行平台->获取执行sql的对象
         */
        Statement statement = connection.createStatement();

        // 5. 执行sql
        statement.executeUpdate(sql);

        // 7. 释放资源
        statement.close();
        connection.close();
    }

    @Test
    public void select() throws Exception {
        // 1. 注册驱动
        // DriverManager.registerDriver(new Driver());
        Class.forName("com.mysql.cj.jdbc.Driver");
        // 2. 获取链接
        String url = "jdbc:mysql://localhost:3306/ntest";
        String name = "root";
        String pwd = "xxxxx"; // 这个肯定不是真实的密码，需要根据自己修改
        // 我自己的密码是最常用密码全小写无后缀版本
        Connection connection =  DriverManager.getConnection(url, name, pwd);
        System.out.println("connection = " + connection);

        // 3. 准备sql
        String sql = "select * from user";

        /**
         * 4. 获取执行平台->获取执行sql的对象
         */
        Statement statement = connection.createStatement();

        // 5. 执行sql
        ResultSet rs =  statement.executeQuery(sql);

        // 6. 处理结果
        while(rs.next()) {
            String username = rs.getString("username");
            String password = rs.getString("password");
            System.out.println(username + "......" + password);
        }

        // 7. 释放资源
        rs.close();
        statement.close();
        connection.close();
    }
}
