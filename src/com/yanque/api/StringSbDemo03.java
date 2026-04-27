package com.yanque.api;

import java.util.Scanner;

public class StringSbDemo03 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 8 - (s.length() % 8);
        for (int i = 0; i < s.length(); i++) {
            // 取出每一个字符进行答应
            char c = s.charAt(i);
            System.out.print(c);
            if ((i + 1) % 8 == 0) {
                System.out.println();
            }

        }
        for (int i = 0; i < count; i++) {
            System.out.print("0");
        }
        sc.close();

        //for (int i = 0; i < s.length(); i += 8) {
        //    // 截取
        //    System.out.println(s.substring(i, i + 8));
        //}

        //if (s.length() % 8 == 0) {
        //    System.out.println(s);
        //}


    }
}
