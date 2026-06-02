package com.at.b_prpstmt;

import com.at.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Demo03Login {
    public static void main(String[] args) throws Exception {
        // 1. 创建Scanner
        Scanner sc = new Scanner(System.in);
        // 2. 提示输入用户名和密码
        System.out.println("请输入用户名:");
        String username = sc.nextLine();
        System.out.println("请输入密码:");
        String password = sc.nextLine();
        // 3. 获取链接
        Connection connection = JDBCUtils.getConnection();
        // 4. 准备sql
        String sql = "select * from user where username = ? and password = ?";
        System.out.println(sql);
        // 5. 获取执行对象
        PreparedStatement pst = connection.prepareStatement(sql);
        pst.setObject(1, username);
        pst.setObject(2, password);
        // 6. 执行sql
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            System.out.println("登陆成功");
        } else {
            System.out.println("登录失败");
        }
        // 7. 释放资源
        JDBCUtils.close(connection, pst, rs);
    }
}
