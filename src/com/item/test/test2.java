package com.item.test;

import java.util.Random;

public class test2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random r = new Random();

        for (int i = 0; i < arr.length; ) {
            int num = r.nextInt(101);
            boolean flag = false;

            for (int j = 0; j < i; j++) {
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
