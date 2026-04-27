package com.yanque.AbstractTest.base;

public class Test02 {
    public static void main(String[] args) {

        // 使用for循环语句实现水仙花数
        System.out.println("所有的水仙花数：");
        for (int i = 100; i <= 999; i++) {
            // 示例：135
            // 1 1
            int hundreds = i / 100;        // 百位
            // 0 3
            int tens = (i / 10) % 10;      // 十位
            // 0 5
            int units = i % 10;            // 个位

            if (i == hundreds * hundreds * hundreds +
                    tens * tens * tens +
                    units * units * units) {
                System.out.println(i);
            }
        }


    }
}
