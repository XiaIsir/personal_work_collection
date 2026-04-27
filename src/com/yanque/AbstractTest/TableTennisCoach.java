package com.yanque.AbstractTest;


// 乒乓球教练
public class TableTennisCoach extends Person implements Teach,SpeakEnglish{
    public TableTennisCoach(String name, int age) {
        super(name, age);
    }

    public TableTennisCoach() {
    }

    @Override
    public void study() {
        System.out.println("教乒乓球");
    }

    @Override
    public void speak() {
        System.out.println("说英语");
    }
}
