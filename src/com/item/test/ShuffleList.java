package com.item.test;

public class ShuffleList {
    static void main(String[] args) {

        // 创建一个数组
        int[] arr = {100,200,300,400,500};
        // 打乱数组的数据
        for(int i = 0; i < arr.length; i++) {
            int index = (int)(Math.random() * arr.length);
            int temp = arr[i];

            System.out.println("第"+i+temp);
            arr[i] = arr[index];
            arr[index] = temp;
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
