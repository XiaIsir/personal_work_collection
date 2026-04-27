package com.yanque.api;

import java.util.Scanner;

public class MathTest01 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int num = sc.nextInt();
        // 获取数字的位数
        int len = (num + "").length();

        // 临时变量
        int temp = num;

        int sum = 0;
        // 先取出这个数字的每位
        while (num != 0) {
            // 取出数字的个位
            int lastNumber = num % 10;
            // 去掉右边的数字
            num = num / 10;
            System.out.println(lastNumber);
            // 求lastNumber的幂后累加
            sum = (int) (sum + Math.pow(lastNumber, len));
        }
        System.out.println(sum);
        if (sum == temp) {
            System.out.println("自幂数");
        } else {
            System.out.println("不是自幂数");
        }

    }


}
