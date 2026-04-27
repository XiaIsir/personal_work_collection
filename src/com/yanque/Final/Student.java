package com.yanque.Final;

public class Student {
    // 成员变量
    // final 静态成员变量
    private final String name;
    private int age;
    private static String school;



    // 无参构造方法 - 给 final 变量赋默认值
    public Student() {
        this.name = "小王";
    }

    // 带参构造方法 - 给 final 变量赋指定值
    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // 全参构造方法
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static String getSchool() {
        return school;
    }

    public static void setSchool(String school) {
        // 静态方法中访问静态成员变量，使用类名.变量名
        Student.school = school;
    }
}
