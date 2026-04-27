package com.item.test;

import java.util.Scanner;

public class Demo23 {
    static void main() {
        // 定义一个变量接收用户输入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生人数：");
        // 学生人数
        int n = sc.nextInt();
        int evenCount = 0;
        int evenSum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("请输入第" + (i + 1) + "个学号：");
            int id = sc.nextInt();
            // 判断学号是否是偶数
            if (id % 2 == 0) {
                evenSum += id;
                evenCount++;
            }
        }
        if (evenCount > 0) {
            System.out.println("偶数学号的个数:" + evenCount);
            System.out.println("偶数学号总和:" + evenSum);
        } else {
            System.out.println("没有偶数学号");
        }

    }
}
