package com.yanque.InterfaceBase;


// 接口多继承
public interface Inter extends InterA, InterB {

    @Override
    default void showB() {
        InterB.super.showB();
    }

    @Override
    public default void show() {
        InterA.super.show();
    }

    @Override
    default void showA() {
        InterA.super.showA();
    }
}
