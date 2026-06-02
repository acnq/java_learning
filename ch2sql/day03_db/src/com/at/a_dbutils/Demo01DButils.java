package com.at.a_dbutils;

import org.apache.commons.dbutils.QueryRunner;
import org.junit.Test;
import utils.DruidUtils;

import java.sql.Connection;

public class Demo01DButils {
    @Test
    public void insert() throws Exception {
        // 1. 创建QueryRunner对象
        QueryRunner queryRunner = new QueryRunner();
        // 2. 获取连接对象
        Connection connection = DruidUtils.getConnection();
        // 3. 准备sql
        String sql = "insert into category(cid, cname) values (?, ?)";
        // 4. 执行sql
        queryRunner.update(connection, sql, "1003", "水果");
        DruidUtils.close(connection, null, null);
    }

    @Test
    public void delete() throws Exception {
        QueryRunner qr = new QueryRunner(DruidUtils.getDataSource());
        qr.update("delete from category where cid = ?", 1003);
    }
}
