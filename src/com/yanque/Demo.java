package com.yanque;


public class Demo{
    public static void main(String[] args) {
        // 调用concat方法
        String concat1 = StringHelper.concat("hello", "world");
        String concat2 = StringHelper.concat("hello", "world", "java");
        // 打印
        System.out.println(concat1);
        System.out.println(concat2);
        // 调用repeat方法
        String r = StringHelper.repeat("hello", 4);
        System.out.println(r);
    }
}
