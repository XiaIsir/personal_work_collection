package com.yanque.ThreadDemo;

import java.util.concurrent.FutureTask;

public class Demo02 {
    public static void main(String[] args) {
        // 创建对象，（表示多线程要执行的任务
        MyCallble mc = new MyCallble();
        // 创建FutureTask对象，将Callable接口实现类传递给FutureTask构造器 作业管理多线程运行的结果）
        FutureTask<Integer> ft = new FutureTask<>(mc);
        // 创建线程对象，将FutureTask对象传递给Thread构造器
        Thread t = new Thread(ft);
        // 启动线程
        t.start();

        try {
            // 获取线程运行结果
            Integer sum = ft.get();
            System.out.println(sum);
        } catch (Exception e) {
            e.printStackTrace();
        }




    }
}
