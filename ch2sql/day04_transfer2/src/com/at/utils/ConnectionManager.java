package com.at.utils;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionManager {
    private static ThreadLocal<Connection> t1 = new ThreadLocal<>();
    private ConnectionManager(){}

    /**
     * 从连接池中获取连接对象
     * 保存到ThreadLocal中
     */
    public static Connection getConnection() {
        /**
         * 先从ThreadLocal中获取连接对象
         * 如果为null,证明当前线程还没在ThreadLocal中存储
         * 所以直接从连接池中获取连接对象,保存到ThreadLocal中
         */
        Connection connection = t1.get();
        if (connection == null) {
            connection = DruidUtils.getConnection();
            t1.set(connection);
        }
        return connection;
    }

    /**
     * 开启事务
     */
    public static void begin() throws SQLException {
        // 获取链接对象
        Connection conn = getConnection();
        conn.setAutoCommit(false);
    }
    public static void commit() throws SQLException {
        // 获取链接对象
        Connection conn = getConnection();
        conn.commit();
    }
    public static void rollback() throws SQLException {
        // 获取连接对象
        Connection conn = getConnection();
        conn.rollback();
    }

    /**
     * 释放资源
     */
    public  static void close() {
        // 获取链接
        Connection connection = getConnection();
        // 释放资源
        DruidUtils.close(connection, null, null);
        // 从ThreadLocal中移除
        t1.remove();
    }
}
