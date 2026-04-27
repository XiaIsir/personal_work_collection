package com.item.test;

public class Demo4 {
    static void main(String[] args) {
        // 定义一个变量记录秒
        int second = 7262;
        // 将秒转换为小时
        int hour = second / 3600;
        // 将秒转换为分钟
        int minute = second % 3600 / 60;
        // 将秒转换为秒
        second = second % 60;
        // 打印它们
        System.out.println(hour + ":" + minute + ":" + second);

    }
}
