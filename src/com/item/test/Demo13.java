package com.item.test;

public class Demo13 {
    public static void main(String[] args) {
        // 定义一个整数数组
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8,9,9, 10};
        // 定义一个目标值
        int target = 10;

        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] + arr[j] == target) {
                    System.out.println("两个数的下标为：" + i + " " + j);
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("没有找到符合条件的两个数");
        }
    }
}
