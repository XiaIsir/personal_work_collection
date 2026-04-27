package com.item.test;

import java.util.Scanner;

public class Demo18 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 定义一个变量接收用户输入的小数

        while (true) {
            System.out.println("请输入小数：");
            double num = sc.nextDouble();
            if (num > 0) {
                System.out.println("输入的重量是：" + num+"kg");
                if (num <= 1) {
                    System.out.println("运费是：" + getFreight(num));
                } else if (num > 1 && num <= 5) {
                    System.out.println("运费是：" + getFreight2(num));
                } else {
                    System.out.println("运费是：" + getFreight3(num));
                }
            } else {
                System.out.println("重量必须大于0，请重新输入");
            }
        }
    }

    // 定义方法计算运费,首重1kg:10元,不足按1kg计算,超出1-5kg:每kg按2元计算,超出5kg以上:每kg按1.5元计算,不同价位单独定义一个方法
    public static double getFreight(double weight) {
        double price = 0;
        if (weight <= 1) {
            price = weight * 10;
        }
        return price;
    }

    // 超出1-5kg:每kg按2元计算
    public static double getFreight2(double weight) {
        double price = 0;
        if (weight > 1 && weight <= 5) {
            price = (weight - 1) * 2 + 10;
        }
        return price;
    }

    // 超出5kg以上:每kg按1.5元计算
    public static double getFreight3(double weight) {
        double price = 0;
        if (weight > 5) {
            price = (weight - 5) * 1.5 + 18;
        }
        return price;
    }
}
