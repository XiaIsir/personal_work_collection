package com.item.test;

public class ListDemo {
    static void main(String[] args) {

        // 数组静态初始化小练习

        // 定义一个数组记录同学的体重
        int[] weights = { 57, 68, 70, 80, 90 };
        int[] weights2 = new int[] { 57, 68, 70, 80, 90};

        // 定义一个数组记录同学的身高
        double[] heights = { 1.7, 1.8, 1.65, 1.75, 1.9 };
        double[] heights2 = new double[] { 1.7, 1.8, 1.65, 1.75, 1.9 };

        // 定义一个数组记录同学的姓名
        String[] names = { "小王", "小李", "小张", "小赵", "小孙" };
        String[] names2 = new String[] { "小王", "小李", "小张", "小赵", "小孙" };

        // 遍历数组
        for (int i = 0; i < weights2.length; i++) {
            System.out.println(names2[i] + "的体重是：" + weights2[i]);
        }
    }
}
