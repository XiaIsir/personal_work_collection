package com.yanque;

public class Test {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        int target = 7;
        int start = 0;
        int end = arr.length - 1;

        int result = -1;
        while (start <= end) {

            // 第一次循环后 6,7,8,9,10
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                result = mid;
                break;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        if(result != -1){
            System.out.println("找到了，索引是：" + result);
        }else{
            System.out.println("未找到元素 " + target);
        }
    }
}
