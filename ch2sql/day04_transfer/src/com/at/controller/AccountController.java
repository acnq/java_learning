package com.at.controller;

import com.at.service.AccountService;

import java.util.Scanner;

public class AccountController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入出钱人姓名:");
        String outName = scanner.next();
        System.out.println("请输入收钱人姓名:");
        String inName = scanner.next();
        System.out.println("请输入转账金额:");
        int money = scanner.nextInt();

        // 调用service方法，传递outName, inName, 和money
        AccountService accountService = new AccountService();
        accountService.transfer(outName, inName, money);
    }
}
