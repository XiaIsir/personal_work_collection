package com.yanque.base;

public class MeijuTest {
    public static void main(String[] args) {
        MeijuLei s1 = MeijuLei.SUNDAY;
        System.out.println(s1.getDay());


        // 匹配
        switch (s1) {
            case SUNDAY ->System.out.println("星期天");
            case MONDAY->System.out.println("星期一");
            case TUESDAY->System.out.println("星期二");
            case WEDNESDAY->System.out.println("星期三");
            case THURSDAY->System.out.println("星期四");
            case FRIDAY->System.out.println("星期五");
            case SATURDAY->System.out.println("星期六");
        }
    }


}
