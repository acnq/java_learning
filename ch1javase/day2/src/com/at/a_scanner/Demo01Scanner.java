package com.at.a_scanner;

import java.util.Scanner;

public class Demo01Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int data1 = scanner.nextInt();
        int data2 = scanner.nextInt();

        int res = data1 * data2;
        System.out.println(data1 +  "*" + data2 + "=" + res);
    }


}
