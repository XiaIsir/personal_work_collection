package com.yanque.Inter;


public  class Outer {
    private int a = 10;

    // 内部类
    class Inner {

        private int a = 20;

        private void show() {
            int a = 30;
            // 访问内部a
            System.out.println(a);//10
            // 访问外部a
            System.out.println(this.a);//20
            // 访问最外层a
            System.out.println(Outer.this.a);//30
        }
    }
    public Inner getInner() {
        return new Inner();
    }
}

