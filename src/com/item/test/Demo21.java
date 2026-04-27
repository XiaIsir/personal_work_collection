package com.item.test;

import java.util.Random;

public class Demo21 {
    public static void main(String[] args) {
        // 综合业务：红包金额随机抽奖，要求每个人都必须抽到一份
        int money = 20000; //分
        int count = 5;
        Random r = new Random();
        while (count > 0) {
            int amount;
            if (count == 1) {
                // 最后一个人拿走剩余所有金额
                amount = money;
            } else {
                // 前面的人随机抽取,确保后面的人至少能拿到1元
                amount = r.nextInt(money - count + 1) + 1;
            }
            money -= amount;
            System.out.println("第" + (5 - count + 1) + "个人抢到红包：" + amount + "分");
            System.out.println("剩余红包：" + money + "分");
            count--;
        }
    }
}
