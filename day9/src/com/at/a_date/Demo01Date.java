package com.at.a_date;

import java.util.Date;

public class Demo01Date {
    public static void  main(String[] args) {
        Date date1 = new Date();
        System.out.println("date1 = " + date1);

        System.out.println("===============");
        Date date2 = new Date(1000L);
        System.out.println("date2 = " + date2);
    }
}
