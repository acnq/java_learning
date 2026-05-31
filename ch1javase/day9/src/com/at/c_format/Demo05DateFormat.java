package com.at.c_format;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo05DateFormat {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println("date = " + date);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = sdf.format(date);
        System.out.println("time = " + time);
        System.out.println("=====================");
        String time2 = "2000-10-10 10:10:10";
        Date date1 = sdf.parse(time2);
        System.out.println("date1 = " + date1);

    }
}
