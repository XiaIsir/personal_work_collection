package com.yanque.AbstractTest.base;

public class AnimalApusicImpl extends Animal {
    public AnimalApusicImpl() {
    }


    public AnimalApusicImpl(String name, int age) {
        super(name, age);
    }

    @Override
    public void sleep() {
        System.out.println("睡睡睡");
    }

    @Override
    public void drink() {
        System.out.println("喝喝喝");
    }

    @Override
    public void eat() {
        System.out.println("吃吃吃");
    }
}
