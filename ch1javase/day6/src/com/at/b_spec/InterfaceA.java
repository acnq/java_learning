package com.at.b_spec;

public interface InterfaceA {
    default void method() {
        System.out.println("A的默认方法");
    }
}
