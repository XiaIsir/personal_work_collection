package com.yanque.base;

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[6];

        for (int i = 0; i < arr.length;) {
            System.out.println("请输入跳绳次数");
            arr[i] = sc.nextInt();
            if (arr[i] < 0){
                System.out.println("输入的数字有误");
                continue;
            }
            i++;
        }
        int min = arr[0];
        int max = arr[0];
        double sum =0;
        for (int i : arr) {
            if (i < min){
                min = i;
            }else if (i > max){
                max = i;
            }
            sum += i;
        }
        // 平均值，去掉最大值最小值，结果保留一位小数
        double avg = (sum - max - min) / (arr.length - 2);
        System.out.println("平均值是：" + String.format("%.1f", avg));
        System.out.println("最大值是：" + max);
        System.out.println("最小值是：" + min);
        sc.close();
    }

}
