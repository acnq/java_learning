package com.at.b_mtdref;

import com.at.b_mtdref.Person;

import java.util.function.Function;

public class Demo04Method {
    public static void method(Function<String, Person> function, String name) {
        Person person = function.apply(name);
        System.out.println(person);
    }

    public static void main(String[] args) {
        method(new Function<String, Person>() {
            @Override
            public Person apply(String s) {
                return new Person(s);
            }
        }, "张三");
        System.out.println("-------------------");
        method(s -> new Person(s), "张三");
        System.out.println("====================");
        method(Person::new, "张三");
    }
}
