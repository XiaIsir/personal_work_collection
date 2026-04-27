package com.item.test;

import java.util.Scanner;

public class Demo17 {
    static void main(String[] args) {
        // 评委打分
        // 定义一个数组记录键盘录入的5个评分
        double[] arr = new double[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个学生的成绩：");
            // 判断评分范围1-100
            double score = sc.nextDouble();
            while (score < 1 || score > 100) {
                System.out.println("成绩无效 请重新输入");
                score = sc.nextInt();
            }
            arr[i] = score;

        }
        getPassRate(arr);
        getAvg(arr);
        System.out.println("最大值是:"+getMax(arr));
    }
    // 定义一个方法求及格人数，根据及格人数求及格率
    public static void getPassRate(double[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 60) {
                count++;
            }
        }
        System.out.println("及格人数是：" + count);
        System.out.println("及格率是：" + (count * 1.0 / arr.length)*100+"%");
    }
    // 定义一个方法求总分，根据总分求平均值
    public static void getAvg(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("总分是：" + sum);
        System.out.println("平均分是：" + sum * 1.0 / arr.length);
    }

    // 定义一个方法求最大值
    public static double getMax(double[] arr){
        double max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
