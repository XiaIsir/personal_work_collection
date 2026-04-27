package com.item.test;

public class Demo14 {
    static void main(String[] args) {
        // 定义一个数组
        int[] arr = {1, 2, 3, 4, 5};

        // 遍历输出格式[1, 2, 3, 4, 5]

        printArray(arr);

    }
    // 定义一个方法遍历数组
    public static void printArray(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
