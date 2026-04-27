package com.yanque.base;

import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入作为程序员的你的工作的工龄：");
        int WorkingYears = sc.nextInt();

        System.out.println("请输入作为程序员的你的基本工资为：");
        int money = sc.nextInt();

        if (WorkingYears < 0 || WorkingYears > 15) {
            System.out.println("工龄输入错误");
            return;
        }
        if (money < 0) {
            System.out.println("工资输入错误");
            return;
        }
        int count = 0;
        if (WorkingYears < 15 && WorkingYears >= 10) {
            count = 20000;
        } else if (WorkingYears >= 5 && WorkingYears < 10) {
            count = 10000;
        } else if (WorkingYears >= 3 && WorkingYears < 5) {
            count = 5000;
        } else if (WorkingYears >= 1 && WorkingYears < 3) {
            count = 3000;
        } else {
            System.out.println("你没有工作");
        }

        int finalSalary = money + count;

        System.out.println("您目前工作了" + WorkingYears + "年，基本工资为 " + money + "应涨工资 " + count + "元,涨后工资 " + finalSalary + "元");

        sc.close();
    }
}
