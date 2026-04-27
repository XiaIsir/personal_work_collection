package com.yanque.InterfaceBase;

public interface InterB {

    // 抽象方法
    public default void show(){
        System.out.println("接口通用");
    }

    public default void showB() {
        System.out.println("接口方法B");
    }
}
