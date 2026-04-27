package com.yanque.AbstractTest;

// 篮球运动员
public class Hoopster extends Paddler implements  Study{
    public Hoopster(String name, int age) {
        super(name, age);
    }

    public Hoopster() {
    }

    @Override
    public void study() {
        System.out.println("学习篮球");
    }
}
