package com.at.b_spec;

public class InterfaceImpl implements InterfaceA, InterfaceB{
    @Override
    public void method() {
        InterfaceA.super.method();
        InterfaceB.super.method();
    }
}
