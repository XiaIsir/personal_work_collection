package com.yanque.api;

import java.util.Scanner;

public class StringSbDemo02 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请输入：");
            String s = sc.next();
            StringBuilder sb = new StringBuilder(s);
            if (s.equals("拜拜")) {
                System.out.println("程序结束");
                break;
            }else{
                sb.reverse().toString();
                System.out.println(sb);
            }
        }
    }
}
