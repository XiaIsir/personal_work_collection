package com.yanque.AbstractTest;

public class Test {
    public static void main(String[] args) {
        // 测试类
        // 乒乓球运动员
        Paddler paddler = new Paddler("小王", 18);
        System.out.println(paddler.getName());
        System.out.println(paddler.getAge());
        paddler.study();
        paddler.speak();
        System.out.println("-------------------");
        // 篮球教练
        BasketballCoach basketballCoach = new BasketballCoach("蓝教", 49);
        System.out.println(basketballCoach.getName());
        System.out.println(basketballCoach.getAge());
        basketballCoach.study();
        System.out.println("-------------------");
        // 乒乓球教练
        TableTennisCoach tableTennisCoach = new TableTennisCoach("王五", 42);
        System.out.println(tableTennisCoach.getName());
        System.out.println(tableTennisCoach.getAge());
        tableTennisCoach.study();
        tableTennisCoach.speak();
        System.out.println("-------------------");
        // 篮球运动员
        Hoopster hoopster = new Hoopster("李四", 18);
        System.out.println(hoopster.getName());
        System.out.println(hoopster.getAge());
        hoopster.study();




    }
}
