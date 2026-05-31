package com.at.c_replic;

public class InterfaceImpl implements InterfaceA, InterfaceB{
    @Override
    public void method() {
        System.out.println("重写method");
    }
    @Override
    public void methodDef() {
        System.out.println("重写的methodDef");
    }
}
