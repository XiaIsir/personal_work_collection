package com.yanque.Inter;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        // 创建内部类
        //Outer.Inner oi = new Outer().new Inner();
        //oi.show();

        Outer o = new Outer();
        System.out.println(o.getInner());

        Scanner sc = new Scanner(System.in);
        sc.next();
    }
}
