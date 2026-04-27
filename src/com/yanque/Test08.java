package com.yanque;

public class Test08 {
    public static void main(String[] args) {

        //throw new RuntimeException("a > b");
        System.out.println("hello world");

        int arr [] = {1,2,3,4,5,6,7,8,9,10};

        try {
            System.out.println(arr[10]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组越界异常");
        }
        System.out.println("程序继续执行");

    }
}
