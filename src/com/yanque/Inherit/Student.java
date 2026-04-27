package com.yanque.Inherit;

public class Student extends Person {
    public Student() {
    }

    public Student(String id, String name, double money) {
        super(id, name, money);
    }

    @Override
    public void work() {

    }
}
