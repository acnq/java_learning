package com.at.dao;

import com.at.utils.ConnectionManager;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.SQLException;

public class AccountDao {
    public void outMoney(String outName, int money) throws SQLException {
        QueryRunner qr = new QueryRunner();
        String sql = "update account set money = money - ? where name = ?";
        qr.update(ConnectionManager.getConnection(), sql, money, outName);
    }

    public void inMoney(String inName, int money)  throws SQLException{
        QueryRunner qr = new QueryRunner();
        String sql = "update account set money = money + ? where name = ?";
        qr.update(ConnectionManager.getConnection(), sql, money, inName);
    }
}
