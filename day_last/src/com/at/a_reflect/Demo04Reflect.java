package com.at.a_reflect;

import org.junit.Test;

import java.lang.reflect.Method;

public class Demo04Reflect {

    @Test
    public void method01() {
        Class<Person> personClass = Person.class;
        Method[] methods = personClass.getMethods();
        for (Method method: methods) {
            System.out.println("method = " + method);
        }
    }

    @Test
    public void method02() throws Exception {
        Class<Person> personClass = Person.class;
        Person person = personClass.newInstance();
        Method setName = personClass.getMethod("setName", String.class);
        setName.invoke(person, "张三");

        Method getName = personClass.getMethod("getName");
        Object name = getName.invoke(person);
        System.out.println(name);
    }

    @Test
    public void method03() throws Exception {
        Class<Person> personClass = Person.class;
        Person person = personClass.newInstance();
        Method eat = personClass.getDeclaredMethod("eat");
        eat.setAccessible(true);
        eat.invoke(person);
    }
}
