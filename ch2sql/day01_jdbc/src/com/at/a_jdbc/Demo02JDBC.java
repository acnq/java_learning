package com.at.a_jdbc;

import com.at.utils.JDBCUtils;
import org.junit.Test;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo02JDBC {
    @Test
    public void insert() throws Exception{
        Connection connection = JDBCUtils.getConnection();
        String sql = "insert into user (username, password) values ('zhangsan', '123')";
        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);
        JDBCUtils.close(connection, statement, null);
    }

    @Test
    public void select() throws Exception {
        Connection connection = JDBCUtils.getConnection();
        String sql = "select * from user";
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(sql);

        while (rs.next()) {
            String username = rs.getString("username");
            String password = rs.getString("password");
            System.out.println(username + "......" + password);
        }

        JDBCUtils.close(connection, statement, rs);
    }
}
