package com.yanque.AbstractTest.base;
// 测试类
public class Demo {
    public static void main(String[] args) {
        Shape circle = new Circle(10);
        Shape re = new Recangle(10, 20);


        circle.printArea();
        re.printArea();
    }
}
