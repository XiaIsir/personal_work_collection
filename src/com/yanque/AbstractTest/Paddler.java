package com.yanque.AbstractTest;


//乒乓球运动员
public class Paddler extends Person implements  Study, SpeakEnglish{
    public Paddler(String name, int age) {
        super(name, age);
    }

    public Paddler() {
    }

    @Override
    public void study() {
        System.out.println("学习打乒乓球");
    }

    @Override
    public void speak() {
        System.out.println("说英语");
    }
}
