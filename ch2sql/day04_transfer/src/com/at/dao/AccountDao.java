package com.at.dao;

import org.apache.commons.dbutils.QueryRunner;

import java.sql.Connection;
import java.sql.SQLException;

public class AccountDao {
    public void outMoney(Connection conn, String outName, int money) throws SQLException {
        QueryRunner qr = new QueryRunner();
        String sql = "update account set money = money - ? where name = ?";
        qr.update(conn, sql, money, outName);
    }

    public void inMoney(Connection conn, String inName, int money)  throws SQLException{
        QueryRunner qr = new QueryRunner();
        String sql = "update account set money = money + ? where name = ?";
        qr.update(conn, sql, money, inName);
    }
}
