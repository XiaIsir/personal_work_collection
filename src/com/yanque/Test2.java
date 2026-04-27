package com.yanque;

public class Test2 {
    public static void main(String[] args) {

        // 定义一个数组
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // 创建一个变量记录要查找的元素
        int t = 5;
        int start = 0;
        int end = arr.length - 1;
        int result = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == t) {
                result = mid;
                break;
            } else if (arr[mid] > t) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        if (result != -1) {
            System.out.println("找到了，索引是：" + result);
        } else {
            System.out.println("未找到元素 " + t);
        }
    }
}
