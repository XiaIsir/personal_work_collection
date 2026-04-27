package com.yanque.ThreadDemo01;

public class Foodie extends  Thread{

    @Override
    public void run() {
        /**
         * 写多线程的四步套路
         * 1.循环
         * 2.同步代码块
         * 3.判断共享数据是否到了末尾（到了末尾）
         * 4.判断共享数据是否到了末尾（没有到末尾，执行核心逻辑）
         */
        while(true){
            synchronized (Desk.lock){
                if(Desk.count == 0){
                    break;
                }else{
                    if (Desk.foodFlag == 1){

                        // 吃完总数-1
                        Desk.count--;
                        // 有食物
                        // 开吃，吃完唤醒厨师做食物，总共吃十碗
                        System.out.println("吃货还能吃"+Desk.count+"碗面");
                        // 唤醒厨师
                        Desk.lock.notifyAll();
                        // 修改状态
                        Desk.foodFlag = 0;
                    }else{
                        // 没食物
                        // 等待
                        try {
                            Desk.lock.wait(); // 锁对象绑定的对象 wait()
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    System.out.println("吃货正在吃第"+Desk.count+"个食物");
                }
            }
        }
    }
}
