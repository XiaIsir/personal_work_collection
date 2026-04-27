package com.item.test;

public class Demo12 {
    static void main(String[] args) {

        // 定义一个数据重复且有序递增的数组
        int[] arr = {1,1,2,2,2,3,3,3,3,4,4,4,5,5,5,5,5,6,6,6,6,6,7,7,7,7,7,7,8,8,8,8,8,9,9,9,9,9,9,9,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};

        // 定义一个慢支指针变量
        int slow = 0;
        int fast = 1;
        while (fast < arr.length) {
            if (arr[slow] != arr[fast]) {
                slow++;
                arr[slow] = arr[fast];
            }
            fast++;
        }
        for(int i = 0; i <= slow; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
