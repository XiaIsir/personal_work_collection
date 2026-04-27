package com.yanque.ThreadDemo;

public class MyThread extends  Thread{

    public MyThread(String mame) {

    }

    public MyThread() {
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            // 线程休眠1秒
            //Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName()+"HelloWorld");
        }
    }
}
