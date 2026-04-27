package com.yanque.api;

public class MathTest {
    public static void main(String[] args) {
        isPrime(997);

    }

    // 判断一个数是不是质数
    public static void isPrime(int number) {
        for (int i = 2; i < Math.sqrt(number); i++) {
            System.out.println( i);
            if (number % i == 0) {
                System.out.println(number+"不是质数");
            }
        }
        System.out.println(number+"是质数");
    }
}
