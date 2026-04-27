package com.yanque.AbstractTest;

// 篮球教练
public class BasketballCoach extends Person implements Teach{
    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    public BasketballCoach() {
    }

    @Override
    public void study() {
        System.out.println("教篮球");
    }
}
