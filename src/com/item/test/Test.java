package com.item.test;

public class Test {
    static void main(String[] args) {
        // 输出恐龙的信息：霸王龙 8岁 11.5 公

        //输出恐龙的名字
        System.out.print("霸王龙");

        //输出恐龙的年龄
        System.out.print("8岁");

        //输出恐龙的体重
        System.out.print("11.5");

        //输出恐龙的性别
        System.out.print("公");

        /*微信余额：0元
        支付宝余额：10元
        银行卡余额：20元
        问题一：请问现在一共有多少钱？
        问题二：微信收了10元红包，又发了2元红包，余额多少？*/
        // 定义一个变量记录微信的余额
        int weixin = 0;
        // 定义一个变量记录支付宝的余额
        int zhifubao = 10;
        // 定义一个变量记录银行卡的余额
        int bank = 20;
        // 定义一个变量记录微信+支付宝的余额+银行的余额
        int sum = weixin + zhifubao + bank;
        // 一个有多少 钱
        System.out.println("现在一共有" + sum + "元");
        // 微信收了10元红包，又发了2元红包，余额多少？
        weixin = weixin + 10 - 2;
        // 输出
        System.out.println("微信余额：" + weixin + "元");
    }
}
