package com.yanque.base;

import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        // 定义键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数："); // 30
        int number = sc.nextInt();
        System.out.println("请输入二个整数："); // 20
        int number2 = sc.nextInt();
        System.out.println("请输入三个整数："); // 40
        int number3 = sc.nextInt();
        int result;

        if (number > number2 && number > number3) {
            result = number;
        } else if (number2 > number3) {
            result = number2;
        } else {
            result = number3;
        }
        System.out.println("最大的数是：" + result);
    }
}
