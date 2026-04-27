package com.yanque.base;

public enum MeijuLei {
    // 枚举类
    SUNDAY(7),
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6);

    private int day;

    private MeijuLei(int day) {
        this.day = day;
    }
    public int getDay() {
        return day;
    }

    public void show() {
        System.out.println("星期" + this.name());
    }

}
