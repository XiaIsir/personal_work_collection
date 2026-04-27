package com.yanque.ThreadDemo;

public class Demo {
    public static void main(String[] args) {

        MyThread t1 = new MyThread("线程1");
        MyThread t2 = new MyThread("线程1");

        t1.setName("线程1");
        t2.setName("线程2");


        t1.start(); // 启动线程
        t2.start(); // 启动线程


    }
}
