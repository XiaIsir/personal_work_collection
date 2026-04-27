package com.yanque.ThreadDemo01;

public class Cook extends Thread{

    // 厨师

    /**
     * 1.循环
     * 2.同步代码块
     * 3.判断共享数据是否到了末尾，（到了末尾）
     * 4.判断共享数据是否到了末尾，（没到末尾，执行核心代码
     */

    @Override
    public void run() {
        while (true){
            synchronized (Desk.lock){
                if(Desk.count==0){
                    break;
                }else{
                    if(Desk.foodFlag == 0){
                        // 没有食物开始做食物
                        // 做完修改状态，并且唤醒吃货来吃
                        System.out.println("厨师正在做美食");
                        Desk.foodFlag = 1;
                        Desk.lock.notify();

                    }else{
                        // 有食物
                        // 等待
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }

        }
    }
}
