package com.item.test;

public class Demo20 {
    public static void main(String[] args) {
        // 定义一个长的数组
        int[] arr1 = {2, 4, 6, 7, 8, 9, 10};
        // 定义一个短的数组
        int[] arr2 = {1, 3, 5};
        int[] arr3 = mergeArray(arr1, arr2);
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]+" ");
        }
    }
    // 定义一个方法合并两个数组
    public static int[] mergeArray(int[] arr1, int[] arr2) {
        // 边界检查
        if (arr1 == null || arr1.length == 0) {
            return arr2;
        }
        if (arr2 == null || arr2.length == 0) {
            return arr1;
        }

        int index = 0;
        int index2 = 0;
        int[] arr3 = new int[arr1.length + arr2.length];


        for (int i = 0; i < arr3.length; i++) {
            if (index == arr1.length) {
                arr3[i] = arr2[index2];
                index2++;
                continue;
            }
            if (index2 == arr2.length) {
                arr3[i] = arr1[index];
                index++;
                continue;
            }

            if (arr1[index]<arr2[index2]){
                arr3[i] = arr1[index];
                index++;
            }else{
                arr3[i] = arr2[index2];
                index2++;
            }
        }
        return arr3;
    }
}
