package com.yanque;

import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) {
        // 定义变量接收用户输入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入宽度：");
        int width = sc.nextInt();
        System.out.println("请输入高度：");
        int height = sc.nextInt();
        // 调用方法
        printRactangle(width, height);
        sc.close();

    }
    public static void printRactangle(int width, int height) {
        if(width <= 0 || height <= 0){
            System.out.println("输入无效, 无法打印");
            return;
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}
