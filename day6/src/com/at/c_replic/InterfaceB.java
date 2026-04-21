package com.at.c_replic;

public interface InterfaceB {
    public abstract void method();
    public default void methodDef() {
        System.out.println("InterfaceB Default");
    }
}
