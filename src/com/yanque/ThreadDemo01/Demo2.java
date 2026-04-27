package com.yanque.ThreadDemo01;

public class Demo2 {
    public static void change(String s) {
        s = "World";
    }

    public static void main(String[] args) {
        String str = "Hello";
        change(str);
        System.out.println(str);

    }
}
