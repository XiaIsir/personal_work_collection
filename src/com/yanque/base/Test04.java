package com.yanque.base;

public class Test04 {
    public static void main(String[] args) {

        Manager m = new Manager();
        m.setName("张三");
        m.setId(888);
        m.setSalary(15000);
        m.setBonus(6000);
        m.work();
        System.out.println("-------------------");
        Coder c = new Coder();
        c.setName("李四");
        c.setId(666);
        c.setSalary(10000);
        c.work();
    }
}
