package com.at.b_gc;

public class Person {
    @Override
    protected void finalize() throws Throwable {
        System.out.println(this + "被清理");
    }
}
