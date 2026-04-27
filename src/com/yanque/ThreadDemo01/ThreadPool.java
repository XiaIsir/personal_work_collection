package com.yanque.ThreadDemo01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    public static void main(String[] args) {
        // 获取线程池对象
        ExecutorService pool1 = Executors.newCachedThreadPool();
        // 获取线程池对象，固定大小
        ExecutorService pool2 = Executors.newFixedThreadPool(3);

        pool2.submit(new MyThread());
        pool2.submit(new MyThread());
        pool2.submit(new MyThread());
        pool2.submit(new MyThread());

    }
}
