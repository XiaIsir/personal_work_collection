package com.yanque.ThreadDemo01;

public class Desk {

    // 定义一个变量判断是否有食物 0表示没有食物，1表示有食物
    public static int foodFlag = 0;

    // 定义一个变量记录总个数
    public static int count = 10;

    // 创建锁对象
    public static Object lock = new Object();



}
