package com.item.test;

import java.util.Scanner;

public class Demo24 {
    public static void main(String[] args) {
        // 定义键盘录入
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        while (true) {
            System.out.println("请输入学生成绩：");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100) {
                sum += score;
                count++;
            } else if (score == -1) {
                System.out.println("没有输入任何成绩");
                break;
            } else {
                System.out.println("成绩无效，请重新输入");
            }
            if (score == -1) {
                break;
            }
        }
        if (count == 0) {
            System.out.println("输出无成绩信息");
        } else {
            System.out.println("平均分是：" + sum * 1.0 / count);
        }
    }
}
