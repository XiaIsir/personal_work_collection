package com.yanque.ThreadDemo01;

public class Demo {
    public static void main(String[] args) {

        // 创建两个对象
        Cook c = new Cook();
        Foodie f = new Foodie();

        c.setName("厨师");
        f.setName("吃货");

        c.start();
        f.start();


    }
}
