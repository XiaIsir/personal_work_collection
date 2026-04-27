package com.yanque.base;

public class Test01 {
    public static void main(String[] args) {
/*      在测试类中通过对象完成成员变量和成员方法的使用
        运行效果:
        长为: 8, 宽为: 6 的矩形的面积为: 48
        长为: 8, 宽为: 6 的矩形的周长为: 28*/
        Rectangle r = new Rectangle();
        r.setLength(8);
        r.setWidth(6);
        r.area();
        r.size();
        System.out.println("-------------------");
        // 对象满参构造调用
        Rectangle r1 = new Rectangle(8,6);
        r1.area();
        r1.size();


    }

}
