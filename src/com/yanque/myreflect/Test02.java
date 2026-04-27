package com.yanque.myreflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {

        // 第一种
        // 全类名 + 包名 常用的方法
        // 获取class字节码文件及对象
        Class clazz = Class.forName("com.yanque.myreflect.Student");

       // 获取成员方法
        System.out.println("----------获取成员方法-----------");
        // 获取所有方法，包括继承的
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        // 获取所有方法，不包括继承的
        Method[] methods2 = clazz.getDeclaredMethods();
        for (Method method : methods2) {
            System.out.println(method);
        }
        System.out.println("----------获取指定成员方法-----------");
        Method method = clazz.getMethod("show", String.class);
        System.out.println(method);

        System.out.println("----------获取指定成员方法并调用-----------");

        Student stu = new Student();
        method.setAccessible(true);
        method.invoke(stu, "张三");



    }
}
