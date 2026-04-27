package com.item.test;

import java.util.Scanner;

public class Demo2 {
    static void main(String[] args) {
        // 让Scanner干活
        Scanner sc = new Scanner(System.in);

        // 接收键盘输入的整数
        int num = sc.nextInt();
        System.out.println(num);
        // 接收键盘输入的数字
        double num2 = sc.nextDouble();
        System.out.println(num2);
        // 接收键盘输入的的文本
        String str = sc.next();

    }
}
