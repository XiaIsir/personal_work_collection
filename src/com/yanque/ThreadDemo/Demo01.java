package com.yanque.ThreadDemo;

public class Demo01 {
    public static void main(String[] args) {

        MyRun mr = new MyRun();

        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);


        t1.setName("线程1");
        t2.setName("线程2");

        t1.setName("线程1");
        t2.setName("线程2");

        t1.start(); // 启动线程
        t2.start(); // 启动线程


    }
}
