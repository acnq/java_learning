package com.at.b_spec;

public interface InterfaceB {
    default void method() {
        System.out.println("B的默认方法");
    }
}
