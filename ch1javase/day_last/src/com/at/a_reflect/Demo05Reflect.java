package com.at.a_reflect;

import org.junit.Test;

import java.lang.reflect.Field;

public class Demo05Reflect {
    @Test
    public void method01() throws Exception {
        Class<Person> personClass = Person.class;
        Field[] fields = personClass.getFields();
        for (Field field: fields) {
            System.out.println(field);
        }

        System.out.println("======================");
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field declaredField: declaredFields) {
            System.out.println(declaredField);
        }
    }

    @Test
    public void method02() throws Exception {
        Class<Person> personClass = Person.class;
        Person person = personClass.newInstance();
        Field gender = personClass.getField("gender");

        gender.set(person, "男");

        Object o = gender.get(person);
        System.out.println("o = " + o);

        System.out.println("==========================");

        Field name = personClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(person, "小红");
        Object o1 = name.get(person);
        System.out.println("o1 = " + o1);
    }
}
