package com.at.a_interfac;

public class Test01 {
    public static void main(String[] args){
        Mouse mouse = new Mouse();
        mouse.open();
        mouse.close();
        mouse.dmethod();

        USB.smethod();
        System.out.println(USB.NUM);
    }
}
