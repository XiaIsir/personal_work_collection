package com.yanque.base;

public class Person01 {

    /**
     * 创建一个Person类，并定义成员变量name、age、sex
     * private 静态的, 修饰成员变量, 保证数据安全
     * public 提供外部访问权限
     */
    private String name;
    private int age;
    private char sex;

    public void showInfo() {
        System.out.println("姓名：" + name);
        System.out.println("年龄：" + age);
        System.out.println("性别：" + sex);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}
