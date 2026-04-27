package com.yanque.InterfaceBase;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // 流程控制语句
        int a = 10;
        int b = 15;
        // 定义一个变量接收用户输入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入手机号：");
        String input = sc.next();
        if(input.matches("[0-9]{11}")){
            System.out.println("手机号正确");
        }else {
            System.out.println("手机号错误");
        }
        System.out.println("------------------");
        System.out.println("请输入第一个数a：");
        a = sc.nextInt();
        System.out.println("请输入第二个数b：");
        b = sc.nextInt();

        // 判断两个值谁大谁小
        if (a > b) {
            System.out.println("a大于b");
        }else{
            System.out.println("a小于b");
        }
        // 判断是否为偶数
        if (a % 2 == 0) {
            System.out.println("a是偶数");
        }else{
            System.out.println("a是奇数");
        }
    }

    private static String getInput(String input) {
        return input;
    }
}
