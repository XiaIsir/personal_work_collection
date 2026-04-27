package com.item.test;

import java.util.Scanner;

public class Demo8j {
    static void main(String[] args) {
        // 定义一个数组
        int[] arr = {22,31,41,31,51};
        // 键盘输入一个元素
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查找的元素：");
        int find = sc.nextInt();
//        boolean flag = false;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == find) {
                System.out.println("找到了，索引为：" + i);
//                flag = true;
                count++;
                break;
            }
        }
//        if (!flag){
//            System.out.println("没有找到");
//        }
        if (count == 0){
            System.out.println("没有找到");
        }
    }
}
