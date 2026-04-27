package com.item.test;

import java.util.Scanner;

public class Demo3 {
    static void main(String[] args) {
        // 需求：键盘录入一个三位数，将其拆分为个位，十位，百位

        // 键盘录入一个三位数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数：");
        int num = sc.nextInt();

        // 获取个位数
        int ge = num % 10;
        // 获取十位数
        int shi = num / 10 % 10;
        // 获取百位数
        int bai = num / 100 % 10;
        System.out.println("个位：" + ge);
        System.out.println("十位：" + shi);
        System.out.println("百位：" + bai);

    }
}
