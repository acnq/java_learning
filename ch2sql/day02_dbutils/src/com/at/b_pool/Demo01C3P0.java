package com.at.b_pool;

import org.junit.Test;
import utils.C3P0Utils;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Demo01C3P0 {
    @Test
    public void insert() throws Exception {
        // 1. 获取对象
        Connection connection = C3P0Utils.getConnection();
        // 2. 准备sql
        String sql = "insert into category(cid, cname) values (?, ?)";
        // 3. 获取执行sql的对象
        PreparedStatement pst = connection.prepareStatement(sql);
        // 4. 赋值
        pst.setObject(1, "10001");
        pst.setObject(2, "水果");
        // 5. 执行sql
        pst.executeUpdate();
        // 6. 释放资源
        C3P0Utils.close(connection, pst, null);
    }
}
