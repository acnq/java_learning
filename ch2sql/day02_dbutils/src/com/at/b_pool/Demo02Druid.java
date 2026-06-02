package com.at.b_pool;

import org.junit.Test;
import utils.DruidUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Demo02Druid {
    @Test
    public void insert() throws Exception {
        // 1. 获取链接对象
        Connection connection = DruidUtils.getConnection();
        // 2. 准备sql
        String sql = "insert into category(cid, cname) values(?, ?)";
        // 3. 获取执行sql对象
        PreparedStatement pst = connection.prepareStatement(sql);
        // 4. 为？赋值
        pst.setObject(1, "10002");
        pst.setObject(2, "蔬菜");
        // 5. 执行sql
        pst.executeUpdate();
        // 6. 释放资源
        DruidUtils.close(connection, pst, null);
    }
}
