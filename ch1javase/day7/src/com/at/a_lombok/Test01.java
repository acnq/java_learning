package com.at.a_lombok;

public class Test01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("ABC");
        person.setAge(18);
        System.out.println(person.getName() + "......" + person.getAge());
    }

}
