package com.at.b_calendar;

import java.util.Calendar;
import java.util.Scanner;

public class Demo04Calendar {
    public static void main(String[] args) {
        // 1.键盘录入一个整数,代表年份
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        // 2.获取Calendar对象
        Calendar calendar = Calendar.getInstance();

        /**
         * 3.设置年月日
         *   set(year,2,1)
         *   Calendar的月从0开始算，这是3月1号
         */
        calendar.set(year, 2, 1);
        calendar.add(Calendar.DATE, -1);
        int day = calendar.get(Calendar.DATE);
        if (day == 29) {
            System.out.println(year + "是闰年");
        } else  {
            System.out.println(year + "不是闰年");
        }
    }
}
