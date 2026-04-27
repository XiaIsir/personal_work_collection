package com.yanque.api;

import java.util.Random;

public class StringDemo02 {
    public static void main(String[] args) {

        String str = "abcd";
        char[] arr = str.toCharArray();


        System.out.println(arr);

        Random r = new Random();
        // 打乱数组的数据
        for(int i = 0; i < arr.length; i++) {
            int index = r.nextInt(arr.length);

            char temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        String result = new String(arr);
        System.out.println(result);
    }
}
