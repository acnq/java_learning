package com.at.a_jdbc;

import com.at.utils.JDBCUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo03JDBC {
    @Test
    public void lastInsertId() throws Exception {
        Connection connection = JDBCUtils.getConnection();
        String insertSql = "insert into user (username, password) values ('sth', '666')";
        String lastInsertId = "select last_insert_id()";

        Statement statement = connection.createStatement();

        statement.executeUpdate(insertSql);
        ResultSet resultSet = statement.executeQuery(lastInsertId);

        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            System.out.println(id);
        }

        JDBCUtils.close(connection, statement, resultSet);
    }
}
