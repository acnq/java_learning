package com.at.service;

import com.at.dao.AccountDao;
import com.at.utils.ConnectionManager;
import com.at.utils.DruidUtils;

import java.sql.Connection;
import java.sql.SQLException;

public class AccountService {
    /**
     * @param outName 出钱人
     * @param inName 收钱人
     * @param money 金额
     */
    public void transfer(String outName, String inName, int money) {

        try {

            // 开启事务
            ConnectionManager.begin();

            AccountDao accountDao = new AccountDao();
            accountDao.outMoney(outName, money);
            // System.out.println(1/0); // 打断事务
            accountDao.inMoney(inName, money);

            // 提交事务
            ConnectionManager.commit();
            System.out.println("转账成功");
        } catch (Exception e) {
            // 回滚事务
            try {
                ConnectionManager.rollback();
                System.out.println("转账失败");
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            ConnectionManager.close();
        }
    }
}
