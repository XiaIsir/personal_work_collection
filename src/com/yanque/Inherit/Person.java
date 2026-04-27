package com.yanque.Inherit;

public abstract class Person {
    String id;
    String name;
    double money;

    public Person() {
        System.out.println("父类空参构造运行");
    }
    public Person(String id, String name, double money) {
        this.id = id;
        this.name = name;
        this.money = money;
        System.out.println("父类有参构造运行");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    // 吃饭
    public void eat() {
        System.out.println("吃米饭");
    }

    // 工作 抽象方法
    public abstract void work();
}
