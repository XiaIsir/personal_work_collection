package com.yanque.InterfaceBase;

public interface InterA {


    public default void show(){
        System.out.println("接口通用");
    }
    // 默认方法
    public default void showA() {
        System.out.println("接口方法A");
    }
}
