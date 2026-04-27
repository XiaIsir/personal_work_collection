package com.yanque;

public class Test04 {

    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // 反转列表

        for (int left = 0, right = arr.length - 1; left < right; left++,right--) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

        }
        for (int i = 0; i < arr.length; i++) {
            if(i != arr.length-1){
                System.out.print(arr[i]+" ");
            }else {
                System.out.print(arr[i]);
            }
        }
    }
}
