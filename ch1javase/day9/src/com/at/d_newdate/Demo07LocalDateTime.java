package com.at.d_newdate;

import java.time.LocalDateTime;

public class Demo07LocalDateTime {
    public static void main(String[] args) {
        LocalDateTime local1 = LocalDateTime.now();
        System.out.println("local1 = " + local1);

        System.out.println("==================");
        LocalDateTime local2 = LocalDateTime.of(2000, 10, 1, 12, 30, 15);
        System.out.println("local2 = " + local2);
    }
}
