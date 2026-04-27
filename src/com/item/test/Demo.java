package com.item.test;

public class Demo {
    static void main(String[] args) {
        // BIM = 体重 / 身高的平方

        // 定义变量记录我的体重 57 kg
        double weight = 57;

        // 定义变量记录我的身高
        double height = 1.65;

        // 计算BMI
        double bmi = weight / (height * height);
        System.out.println(bmi);

        // 计算出当前的身高,在标准的BIM下,最多是多少千克？
        double maxWeight = height * height * 25;
        System.out.println(maxWeight);


    }
}
