package com.item.test;

public class Demo8 {
    static void main(String[] args) {

        // 定义一个数组记录人物的战斗力
        int[] arr = {100,200,300,400,500};
        // 查找人物最强战斗力
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("最强战斗力是：" + max);
    }
}
