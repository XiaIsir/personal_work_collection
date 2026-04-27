package com.item.test;

import java.util.Scanner;

public class Demo16 {
    static void main(String[] args) {

        // 评委打分
        // 定义一个数组记录键盘录入的5个评分
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个评委的打分：");
            // 判断评分范围1-100
            int score = sc.nextInt();
            while (score < 1 || score > 100) {
                System.out.println("输入的评分有误，请重新输入：");
                score = sc.nextInt();
            }
            arr[i] = score;
        }
        System.out.println("最高分是：" + getMax(arr));
        System.out.println("最低分是：" + getMin(arr));
        System.out.println("总评分和：" + getSum(arr));
        System.out.println("去掉最高分和最低分后的平均分是：" + getAvg(arr));
    }
    // 定义一个方法求数组的最大值
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
    // 定义一个方法求数组的最小值
    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
    // 定义一个方法求数组的和
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    // 定义一个方法求数组的平均值
    public static double getAvg(int[] arr) {
        return (getSum(arr) - getMax(arr) - getMin(arr)) / (double) arr.length-2;
    }
}
