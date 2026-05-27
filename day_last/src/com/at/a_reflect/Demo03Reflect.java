package com.at.a_reflect;

import org.junit.Test;

import java.lang.reflect.Constructor;

public class Demo03Reflect {
    public static void main(String[] args) {

    }

    @Test
    public void method02() throws Exception {
        Class<Person> personClass = Person.class;
        Constructor<Person> constructor = personClass.getConstructor();
        Person person = constructor.newInstance();
        System.out.println(person);
    }

    @Test
    public void method03() throws Exception {
        Class<Person> personClass = Person.class;
        Person person = personClass.newInstance();
        System.out.println("person = " + person);
    }

    @Test
    public void method04() throws Exception {
        Class<Person> personClass = Person.class;
        Constructor<Person> constructor = personClass.getConstructor(String.class, Integer.class);
        Person person = constructor.newInstance("张三", 18);
        System.out.println("person = " + person);
    }

    @Test
    public void metho05() throws Exception {
        Class<Person> personClass = Person.class;
        Constructor<Person> constructor = personClass.getDeclaredConstructor(String.class);
        // 解除私有
        constructor.setAccessible(true);
        Person person = constructor.newInstance("张三");
        System.out.println("person = " + person);
    }
}
