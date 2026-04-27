package com.yanque.staticmethod;

public class StaticMethod {
    // 静态类静态成员变量
    String name;
    int age;
    // 共享数据
    static String school;

    // 实例方法 - 访问实例变量
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 静态方法 - 访问静态变量
    public  String getSchool() {
        return school;
    }

    public static void setSchool(String school) {
        StaticMethod.school = school;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    // 静态方法 - 显示学校信息
    public  void showSchool() {
        System.out.println("学校: " + school);
    }
    // 显示信息的方法
    public void showInfo() {
        System.out.println("姓名: " + name + ", 年龄: " + age + ", 学校: " + school);
    }
}
