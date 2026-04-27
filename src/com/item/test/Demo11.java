package com.item.test;

import java.util.Random;

public class Demo11 {
    static void main(String[] args) {
        // 定义一个长度为10的数组
        int[] arr = new int[10];
        // 定义一个随机数
        Random r = new Random();
        for (int i = 0; i < arr.length; ) {
            int num = r.nextInt(101);
            boolean flag = false;
            int count = 0;
            for (int j = 0; j < i; j++) {
                if (arr[j] == num) {
                    flag = true;
                    if (num == 0) {
                        System.out.println("找到了");
                        flag = false;
                        count++;
                    }
                    break;
                }
            }
            if (!flag && count < 2) {
                arr[i] = num;
                i++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
