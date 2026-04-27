package com.yanque.api;

import java.util.Scanner;

public class ListTest {
    public static void main(String[] args) {

        // 定义数组
        //int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        //System.out.println(arr[0]);
        // 定义一个变量接收数组
        int[] arr = {1, 2, 3, 4, 5, 6};
        // 定义一个变量拼接字符串
        //String str = "[";
        //for (int i = 0; i < arr.length; i++) {
        //    if(i == arr.length-1){
        //        str = str+arr[i]+"]";
        //    }else {
        //        str = str+arr[i]+", ";
        //    }

       //String str = ArrayUtil.ArrayToString(arr);
       // System.out.println( str);
        // 定义一个键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查找的元素：");
        int s = sc.nextInt();
        sc.close();
        // 遍历数组
        for (int i = 0; i < arr.length; i++) {
            if(s == arr[ i]){
                System.out.println("找到了，索引是：" + i);
                break;
            }else if (i == arr.length-1){
                System.out.println("-1");
            }
        }


    }
}

