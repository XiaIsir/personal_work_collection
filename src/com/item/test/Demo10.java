package com.item.test;

import java.util.Random;

public class Demo10 {
    static void main(String[] args) {
        // 定义一个长度为10的数组
        int[] arr = new int[10];
        // 定义一个随机数
        Random r =  new Random();
        for (int i = 0; i < arr.length; ) {
            int num = r.nextInt(100)+1;
            boolean flag = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == num) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                arr[i] = num;
                i++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
