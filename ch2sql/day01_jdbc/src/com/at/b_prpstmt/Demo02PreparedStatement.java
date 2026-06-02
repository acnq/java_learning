package com.at.b_prpstmt;

import com.at.utils.JDBCUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Demo02PreparedStatement {
    @Test
    public void insert() throws Exception{
        // 1. 获取链接
        Connection connection = JDBCUtils.getConnection();
        // 2. 准备sql
        String sql = "insert into user (username, password) values(?, ?)";
        // 3. 获取sql执行对象
        PreparedStatement pst = connection.prepareStatement(sql);
        // 4. 设置参数
        pst.setObject(1, "tianqi");
        pst.setObject(2, "777");
        // 5. 执行sql
        pst.executeUpdate();
        // 6. 释放
        JDBCUtils.close(connection, pst, null);
    }

    @Test
    public void select() throws Exception{
        // 1. 获取链接
        Connection connection = JDBCUtils.getConnection();
        // 2. 准备sql
        String sql = "select * from user";
        // 3. 获取sql执行对象
        PreparedStatement pst = connection.prepareStatement(sql);
        // 5. 执行sql
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            String username = rs.getString("username");
            String password = rs.getString("password");
            System.out.println(username + "......" + password);
        }
        // 6. 释放
        JDBCUtils.close(connection, pst, null);
    }
}
