package com.yanque.StringDemo;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        String str = "hello world";
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        // 获取指定索引位置的字符
        //char c = str.charAt(2);
        //System.out.println(c);
        // 字符串拼接
        String s1 = "[";
        // 第一种方式
        for (int i = 0; i < s.length(); i++) {
            if (i == s.length()-1){
                s1 += s.charAt(i) + "]";
            }else {
                s1 += s.charAt(i) + ", ";
            }
        }
        //System.out.println(s1);

        // 第二种方式
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < s.length(); i++) {
            if (i == s.length()-1){
                sb.append(s.charAt(i));
                sb.append("]");
            }else{
                sb.append(s.charAt(i));
                sb.append(", ");
            }
        }
        System.out.println(sb);

        // 字符串转换为字符数组
        char[] chars = s.toCharArray();
        System.out.println(chars);
        // 字符串替换
        String s2 = str.replace("l", "L");
        System.out.println(s2);
        // 获取子串
        String s3 = str.substring(1, 5);
        System.out.println(s3);
        // 获取字符串长度
        int length = str.length();
        System.out.println(length);
        // 判断字符串是否为空
        boolean empty = str.isEmpty();
        System.out.println(empty);
        // 获取字符串的索引, 如果字符串中没有这个字符，则返回-1
        int index = str.indexOf("o");
        System.out.println(index);
        char c1 = str.charAt(4);
        System.out.println(c1);

        //// 获取字符串的索引, 从指定索引开始向左查找, 如果字符串中没有这个字符，则返回-1,
        //int index1 = str.lastIndexOf("o");
        //System.out.println(index1);
        //// 获取字符串的索引, 从指定索引开始向右查找, 如果字符串中没有这个字符，则返回-1,
        //int index2 = str.indexOf("o", 5);
        //System.out.println(index2);
    }
}
