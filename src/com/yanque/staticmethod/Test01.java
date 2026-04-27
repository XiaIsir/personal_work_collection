package com.yanque.staticmethod;

public class Test01 {
    public static void main(String[] args) {
        StaticMethod.school = "清华大学";
        StaticMethod sm = new StaticMethod();
        sm.setName("小王");
        sm.setAge(18);
        //sm.school = "清华大学";
        sm.showInfo();
        StaticMethod sm2 = new StaticMethod();

        sm2.showInfo();
        StaticMethod.setSchool("北京大学");
        sm.showInfo();
        sm2.showInfo();
    }
}
