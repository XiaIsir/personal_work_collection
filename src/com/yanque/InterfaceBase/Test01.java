package com.yanque.InterfaceBase;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {

        // 定义一个变量接收用户输入
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if (score >= 95 && score <= 100) {
            System.out.println("小明获得A+");
        } else if (score >= 90 && score <= 94) {
            System.out.println("小明获得A");
        } else if (score >= 80 && score <= 89) {
            System.out.println("小明获得B");
        } else if (score >= 80) {
            System.out.println("小明获得C");
        } else {
            System.out.println("小明没有获得礼物");
        }
    }
}
