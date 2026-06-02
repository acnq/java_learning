package com.at.a_dbutils;

import com.at.pojo.Category;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.junit.Test;
import utils.DruidUtils;

import java.util.List;

public class Demo02DButils {
    @Test
    public void beanHandler() throws Exception {
        QueryRunner qr = new QueryRunner(DruidUtils.getDataSource());
        String sql = "select * from category";
        Category category = qr.query(sql, new BeanHandler<Category>(Category.class));
        System.out.println(category);
    }
    @Test
    public void beanListHandler() throws Exception {
        QueryRunner qr = new QueryRunner(DruidUtils.getDataSource());
        String sql = "select * from category";
        List<Category> list = qr.query(sql, new BeanListHandler<Category>(Category.class));
        for (Category category: list) {
            System.out.println(category);
        }
    }

    @Test
    public void scalarHandler() throws Exception {
        QueryRunner qr = new QueryRunner(DruidUtils.getDataSource());
        String sql = "select count(*) from category";
        Object o = qr.query(sql, new ScalarHandler<>());
        System.out.println(o);
    }

    @Test
    public void columnListHandler() throws Exception {
        QueryRunner qr = new QueryRunner(DruidUtils.getDataSource());
        String sql = "select * from category";
        List<String> list = qr.query(sql, new ColumnListHandler<String>("cname"));
        for (String s: list) {
            System.out.println(s);
        }
    }
}
