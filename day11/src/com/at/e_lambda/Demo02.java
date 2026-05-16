package com.at.e_lambda;

public class Demo02 {
    public static void method(USB usb) {
        usb.open();
    }
    public static void main(String[] args) {
        method(new USB() {
            @Override
            public void open() {
                System.out.println("USB 打开");
            }
        });

        System.out.println("============================");
        method(() -> System.out.println("USB 打开"));
    }
}
