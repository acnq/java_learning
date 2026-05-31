package com.at.f_lambda2;

public class Test01 {
    public static void method(USB usb) {
        String result = usb.open("鼠标");
        System.out.println("result = " + result);
    }
    public static void main(String[] args) {
        method(new USB() {
            @Override
            public String open(String s) {
                return s + "打开";
            }
        });

        System.out.println("==============");

        method((String s) -> {
            return s + "打开";
        });

        System.out.println("=============");

        method(s -> s + "打开");
    }
}
