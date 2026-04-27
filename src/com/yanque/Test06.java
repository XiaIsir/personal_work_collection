package com.yanque;

import java.util.Arrays;

public class Test06 {
    public static void main(String[] args) {

        double result = sumDouble(1.2, 2.3);
        System.out.println(result);
        double doubleMax = getDoubleMax(1.2, 1.2);
        System.out.println(doubleMax);

        // 创建一个数组
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = getArrSum(arr);
        System.out.println(sum);

        // 创建一个有序的Set集合
        //Set<Integer> set = new TreeSet<>();

        getArr(arr, 10);
        printInfo();
    }
    public static void printInfo(){
        System.out.println("hello world");
        return;
    }

    public static int getArrSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static void getArr(int[] arr,int value) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = value;
        }
        System.out.println(Arrays.toString( arr));
    }

    public static double sumDouble(double a, double b) {
        return a + b;
    }

    public static double getDoubleMax(double a, double b) {
        double max;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        return max;
    }

    public static double getDoubleMin(double a, double b) {
        double min;
        if (a < b) {
            min = a;
        } else {
            min = b;
        }
        return min;
    }
}
