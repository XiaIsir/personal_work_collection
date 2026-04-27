package com.yanque.InterfaceBase;

public class Demo {
    public static void main(String[] args) {


        // 不允许创建接口对象
        //Inter inter = new Inter();
        //inter.show();

        // 可以直接调用接口
        InterImpl inter = new InterImpl();
        inter.show();
    }
}
