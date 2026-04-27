package com.yanque.AbstractTest.base;


// 抽象类
// 抽象类不能实例化
public class Cat extends AnimalApusicImpl implements Swim {

    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat() {
    }


    @Override
    public void eat() {
        System.out.println(super.getAge()+"岁的"+super.getName()+"吃吃吃");
    }

    @Override
    public void drink() {
        super.drink();
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public void swim() {
        System.out.println(super.getName() + "会游泳");
    }
}
