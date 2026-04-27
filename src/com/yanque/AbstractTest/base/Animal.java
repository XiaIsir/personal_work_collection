package com.yanque.AbstractTest.base;

public abstract class Animal {
    private String name;
    private int age;


    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    protected Animal() {
    }

    // 吃饭
    public abstract void eat();
    // 喝水
    public abstract void drink();
    // 睡觉
    public abstract void sleep();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
