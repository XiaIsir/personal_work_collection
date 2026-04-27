package com.yanque.myreflect;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {

        // 第一种
        // 全类名 + 包名 常用的方法
        // 获取class字节码文件及对象
        Class clazz1 = Class.forName("com.yanque.myreflect.Student");

        // 第二种方式
        // 一般更多的是当做参数进行传递
        Class clazz2 = Student.class;
        System.out.println(clazz1 == clazz2);

        // 第三种方式
        // 当我们已经有这个类的对象时，才可以使用
        Student stu = new Student();
        Class clazz3 = stu.getClass();

        System.out.println(clazz1 == clazz3);
        System.out.println(clazz2 == clazz3);
    }
}
