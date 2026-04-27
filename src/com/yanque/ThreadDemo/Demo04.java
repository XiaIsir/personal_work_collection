package com.yanque.ThreadDemo;

public class Demo04 {
    public static void main(String[] args) {

        MyRun01 mt = new MyRun01();

        Thread t1 = new Thread(mt);
        Thread t2 = new Thread(mt);
        Thread t3 = new Thread(mt);

        t1.setName("线程1");
        t2.setName("线程2");
        t3.setName("线程3");

        t1.start();
        t2.start();
        t3.start();
    }
}
