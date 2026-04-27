package com.yanque.Final;

public class Test01 {
    public static void main(String[] args) {
        final int a = 10;
        //a = 20;
        System.out.println(a);
        //final Student STU = new Student();
        // final 引用不能重新赋值
        //STU = new Student();
        //System.out.println(STU.getName());

        // do while的使用方法
        do {
            System.out.println("do while");
        }while ( true);
    }
}
