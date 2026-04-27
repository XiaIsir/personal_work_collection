package com.item.test;

import java.util.Scanner;

public class Demo22 {
    public static void main(String[] args) {

        /*
        * 1. 导入 `java.util.Scanner`。
        2. 创建 `Scanner` 对象，提示用户输入第一个整数、运算符、第二个整数。
        3. 使用 `switch` 语句判断运算符，分别进行加、减、乘、除运算。
        4. 在除法分支中，判断第二个数是否为 0，若是则输出错误信息。
        5. 输出计算结果（保留整数即可）。
        6. 关闭 `Scanner`。
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("输入第一个整数:");
        int a = sc.nextInt();
        System.out.println("输入第二个整数:");
        int b = sc.nextInt();
        System.out.println("输入运算符:");
        char op = sc.next().charAt(0);
        switch (op) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                if (b != 0) {
                    System.out.println(a / b);
                } else {
                    System.out.println("除数不能为0");
                }
                break;
            default:
                System.out.println("运算符输入错误");
                break;
        }
    }
}
