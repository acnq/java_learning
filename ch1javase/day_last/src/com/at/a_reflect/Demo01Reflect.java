package com.at.a_reflect;

public class Demo01Reflect {
    public static void main(String[] args) throws ClassNotFoundException {
        /**
         * 1. new对象, Object类中的getClass方法
         *    Class<?> getClass
         */
        Person person = new Person();
        Class<? extends Person> aClass1 = person.getClass();
        System.out.println("aClass1 = " + aClass1);

        System.out.println("====================");

        /**
         * 2. 调用Class类中的静态方法：
         * static Class<?> forName(String className) -> 参数传递的是类的全限定名（包名.类名)
         */
        Class<?> aClass2 = Class.forName("com.at.a_reflect.Person");
        System.out.println("aClass2 = " + aClass2);

        System.out.println("====================");

        /**
         * 3. jvm为基本类型和引用类型都提供了一个共同的静态属性:
         *  class
         */
        Class<Person> aClass3 = Person.class;
        System.out.println("aClass3=" + aClass3);

        System.out.println(aClass1 == aClass2);
    }
}
