package com.yanque.ThreadDemo;

public class Demo03 {
    public static void main(String[] args) {

        MyThread01 t1 = new MyThread01();
        MyThread01 t2 = new MyThread01();

        t1.setName("线程1");
        t2.setName("线程2");



        // 开启线程
        t1.start();
        t2.start();


    }
}
