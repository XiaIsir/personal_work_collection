package com.yanque.staticmethod;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Test06 {
    public static void main(String[] args) {

        // BigDecimal使用
        // 构造方法创建对象
        BigDecimal bd = new BigDecimal("10.0");
        BigDecimal bd0 = new BigDecimal("20.0");
        // 加法
        BigDecimal bd1 = bd.add(bd0);
        System.out.println(bd1);
        // 减法
        BigDecimal bd2 = bd.subtract(bd0);
        System.out.println(bd2);
        // 乘法
        BigDecimal bd3 = bd.multiply(bd0);
        System.out.println(bd3);
        // 除法 需要注意
        BigDecimal[] b5 = bd.divideAndRemainder(bd0);
        System.out.println(b5[0]);
        System.out.println(b5[1]);
        BigDecimal bd4 = bd.divide(bd0, RoundingMode.HALF_UP); // 除不尽会抛异常
        System.out.println(bd4);
        System.out.println(bd4.doubleValue());


        System.out.println("------------------------");
        // 静态方法创建对象
        BigDecimal bd5 = BigDecimal.valueOf(10.0);
        BigDecimal bd6 = BigDecimal.valueOf(20.0);
        BigDecimal bd7 = bd5.add(bd6);
        System.out.println(bd7);


    }
}
