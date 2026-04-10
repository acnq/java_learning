package com.at.a_private;

public class Demo01SetGet {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("A");
        person1.setAge(48);

        System.out.println(person1.getName() + "..." + person1.getAge());

        System.out.println(" ======================================================= ");

        Person person2 = new Person();
        person2.setName("B");
        person2.setAge(8);

        System.out.println(person2.getName() + "..." + person2.getAge());

    }
}
