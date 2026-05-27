package com.at.a_reflect;

import java.lang.reflect.Constructor;

public class Demo02Reflect {
    public static void main(String[] args) throws Exception {
        method01();
        method02();
    }

    private static void method01() {
        Class<Person> personClass = Person.class;
        Constructor<?>[] constructors = personClass.getConstructors();
        for (Constructor<?> constructor: constructors) {
            System.out.println("constructor = " + constructor);
        }
    }

    private static void method02() throws  Exception {
        Class<Person> personClass = Person.class;
        Constructor<Person> constructor = personClass.getConstructor();
        System.out.println(constructor);
    }

}
