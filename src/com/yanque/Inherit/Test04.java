package com.yanque.Inherit;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        // 定义一个变量接收用户输入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第二个数：");
        int a = sc.nextInt();
        System.out.println("请输入第二个数：");
        int b = sc.nextInt();
        System.out.println("两数和是："+(a+b));
        int max = a > b ? a : b;
        System.out.println("最大值是："+max);
    }
}
