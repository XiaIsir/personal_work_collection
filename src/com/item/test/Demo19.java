package com.item.test;

public class Demo19 {

    static void main(String[] args) {

        // 去除有效的数据，定义一个数组
        int[] arr = {0,2,2,1,1,4,4};
        int val = 2;
        // 慢指针
        int slow = 0;
        // 快指针
        int fast = 0;
        while (fast<arr.length){
            if (arr[fast] != val){
                arr[slow] = arr[fast];
                slow++;
            }
            fast++;
        }
        // slow 为有效数据的个数
        for (int i = 0; i < slow; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("有效数据个数为"+ slow);
    }
}
