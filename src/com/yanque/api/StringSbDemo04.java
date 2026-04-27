package com.yanque.api;

import java.util.Scanner;

public class StringSbDemo04 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        // aaaaaaaaaa0000000
        // 第二种思路先补0 在截取
        int LastCount = s.length() % 8;
        int count = 8 - LastCount;

        if (count != 0){
            String Ling = "00000000".substring(0, count);
            s += Ling;
        }

        // 截取
        for (int i = 0; i < s.length(); i+=8) {
            String str = s.substring(i, i + 8);
            System.out.println(str);
        }
    }
}
