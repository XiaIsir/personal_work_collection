package com.yanque.AbstractTest.base;
// 父类
public abstract class Shape {
    // 抽象方法 - 获取面积
    public abstract double getArea();

    // 具体方法 - 打印面积信息
    public void printArea() {
        System.out.println("这个图形的面积是：" + getArea());
    }
}
