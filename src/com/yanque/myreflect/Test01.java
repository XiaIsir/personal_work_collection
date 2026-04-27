package com.yanque.myreflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Test01 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {

        // 第一种
        // 全类名 + 包名 常用的方法
        // 获取class字节码文件及对象
        Class clazz = Class.forName("com.yanque.myreflect.Student");

        // 获取构造方法
        //Constructor[] cons = clazz.getConstructors();
        //for (Constructor con : cons) {
        //    System.out.println(con);
        //}
        //System.out.println("-----------");
        //Constructor[] cons2 = clazz.getDeclaredConstructors();
        //for (Constructor con : cons2) {
        //    System.out.println( con );
        //}
        //System.out.println("-----------");
        //Constructor con = clazz.getDeclaredConstructor();
        //System.out.println( con);

        Constructor con2 = clazz.getDeclaredConstructor(String.class, int.class);
        //System.out.println( con2);

        // 获取修饰符
        int modifiers = con2.getModifiers();
        System.out.println(modifiers);

        // 获取参数类型
        Class[] parameterTypes = con2.getParameterTypes();
        for (Class parameterType : parameterTypes) {
            System.out.println(parameterType);
        }
        System.out.println("-----------");

        // 临时取消校验权限
        con2.setAccessible(true);
        Student stu = (Student) con2.newInstance("张三", 18);
        System.out.println(stu);

        System.out.println("-----------");
        // 获取成员变量
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        System.out.println("-----------");
        // 获取成员变量name
        Field name = clazz.getDeclaredField("name");
        System.out.println(name);
        // 临时取消校验权限
        name.setAccessible(true);
        name.set(stu, "王五");
        System.out.println(stu);
        System.out.println("-----------");
        System.out.println(name.getName());
        System.out.println(name.getType());
        System.out.println(name.get(stu));
        System.out.println("-----------");


    }
}
