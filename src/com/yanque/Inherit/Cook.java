package com.yanque.Inherit;

public class Cook extends  Person{

    public Cook() {
        System.out.println("Cook空参构造运行");
    }
    public Cook(String id, String name, double money) {
        super(id, name, money);

        System.out.println("Cook有参构造运行");
    }

    @Override
    public void work() {
        System.out.println(name+"炒菜");
    }
}
