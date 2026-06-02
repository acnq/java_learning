package com.at.a_pst;

import org.junit.Test;
import utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Demo01AddBatch {
    @Test
    public void insert() throws Exception {
        Connection connection = JDBCUtils.getConnection();
        String sql = "insert into category(cid, cname) values (?,?)";
        PreparedStatement pst = connection.prepareStatement(sql);
        for (int i = 0; i < 100; i++) {
            pst.setObject(1, i);
            pst.setObject(2, "水果" + i);
            // 将数据打包如内存
            pst.addBatch();
        }
        pst.executeBatch();
        JDBCUtils.close(connection, pst, null);
    }
}
