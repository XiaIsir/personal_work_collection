package com.yanque.api;

import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();

        int count = 0;
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                count2++;
            } else if (ch >= 'A' && ch <= 'Z') {
                count1++;
            } else if (ch >= 'a' && ch <= 'z') {
                count++;
            }
        }
        System.out.println("数字的个数是：" + count2);
        System.out.println("小写字母的个数是：" + count);
        System.out.println("大写字母的个数是：" + count1);



    }
}
