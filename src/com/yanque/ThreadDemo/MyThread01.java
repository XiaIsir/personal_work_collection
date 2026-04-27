package com.yanque.ThreadDemo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread01 extends Thread {

    static int ticket = 0;
    // 锁对象一定要是唯一的
    // 使用lock锁实现，lock锁可以手动添加释放锁
    static Lock lock = new ReentrantLock();

    @Override
    public void run() {

        while (true) {
            lock.lock();    // 获取锁
            try {
                if (ticket < 100) {
                    ticket++;
                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "票");
                } else {
                    break;
                }
            } catch (RuntimeException e) {
                throw new RuntimeException(e);
            } finally {     // finally代码块，不管程序是否异常，都会执行
                lock.unlock();      // 释放锁
            }

        }

    }
}
