package com.at.b_reflect;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.Properties;

public class Demo01Reflect {
    public static void main(String[] args) throws Exception {
        //1.创建properties集合对象
        Properties properties = new Properties();
        //2.读取配置文件
        InputStream in = Demo01Reflect.class.getClassLoader().getResourceAsStream("reflect.properties");
        // 3.将流中的数据加载到properties集合中
        properties.load(in);
        // 4.获取propertis中的配置
        String className = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");
        // 5.根据获取出来的类的全限定名获取class对象
        Class<?> aClass = Class.forName(className);
        // 6.根据class对象获取对应的实例对象
        Object o = aClass.newInstance();
        // 7.根据class对象获取对应的方法对象
        Method method = aClass.getMethod(methodName);
        // 8. 执行
        method.invoke(o);

    }
}
