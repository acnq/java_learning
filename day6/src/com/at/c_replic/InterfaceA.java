package com.at.c_replic;

public interface InterfaceA {
    public abstract void method();
    public default void methodDef() {
        System.out.println("InterfaceA Default");
    }
}
