package com.yanque.api;

import java.util.Scanner;

public class StringIndex {
    public static void main(String[] args) {

        // 创建字符串对象
        String s1 = "hello world";
        // 获取指定索引处的字符 str.charAt(index)
        //System.out.println(s1.charAt(3));

        // 遍历字符串 s1.length()方法获取字符串长度
        //for (int i = 0; i < s1.length(); i++) {
        //    char c = s1.charAt(i);
        //    System.out.print(c + " ");
        //}


        // replace
        String s2 = s1.replace("world", "Java");
        System.out.println(s2);

        // 铭感词替换

        // 定义一个数组记录铭感词库
        String[] arr = {"TMD","傻逼","傻", "傻X", "傻B", "傻A", "傻C","SB"};

        // 定义一个变量接收用户输入的数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入；");
        String input = sc.next();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].length() == 3){
                input = input.replace(arr[i], "***");
            } else if (arr[i].length() == 2) {
                input = input.replace(arr[i], "**");
            }
            input = input.replace(arr[i], "*");
        }
        System.out.println(input);
    }
}
