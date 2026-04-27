package com.yanque.base;

import java.util.Scanner;

public class Test08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个大于100的三位数：");
        int number = sc.nextInt();
        if (!(number < 1000 && number > 100)) {
            System.out.println("输入错误");
            return;
        }
        int count = 0;
        int sum = 0;
        for (int i = 101; i <= number; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100;
            if (ge == 7) {
                continue;
            } else if (shi == 5) {
                continue;
            } else if (bai ==3) {
                continue;
            }else {
                System.out.println(i);
                sum += i;
                count++;
            }
        }
        System.out.println("这些数字的个数有："+count+"和是："+sum);

        sc.close();
    }

}
