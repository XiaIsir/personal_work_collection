package com.yanque.ThreadDemo;

public class MyRun01 implements Runnable{
    int ticket = 0;

    @Override
    public void run() {

            // 买票
            while(true){
                // 加个锁
                //synchronized (MyRun01.class){
                    if (method()) break;
                //}
        }

    }

    private synchronized boolean method() {
        if(ticket < 100){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            ticket++;
            System.out.println(Thread.currentThread().getName()+"正在卖第"+ticket+"张票");
        }else {
            return true;
        }
        return false;
    }
}
