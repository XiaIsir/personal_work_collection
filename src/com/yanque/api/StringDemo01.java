package com.yanque.api;

public class StringDemo01 {
    public static void main(String[] args) {

        String str = "hello world";
        // 截取+转换***
        // 第一种方式
        char s1 = str.charAt(0);
        String str2 = "";
        str2 = s1 + "***";
        System.out.println(str2);

        // 第二种方法 .substring方法(包含头,不包含尾)
        String str3 = str.substring(1, 2) + "***";
        System.out.println(str3);

        // 第三种方法 .substring方法(从索引位置开始截取到末尾)，默认是截取到末尾
        String str4 = str.substring(5) + "***";
        System.out.println(str4);
    }
}
