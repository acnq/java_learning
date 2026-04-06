package com.at.b_class;

public class Demo02Obj {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);
        System.out.println(person.age);

        person.name = "Jack";
        person.age = 18;
        System.out.println(person.name);
        System.out.println(person.age);

        person.eat();
        person.drink();
    }
}
