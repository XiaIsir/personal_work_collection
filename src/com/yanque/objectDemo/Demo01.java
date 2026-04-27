package com.yanque.objectDemo;

public class Demo01 {
    public static void main(String[] args) throws CloneNotSupportedException {

        int[] data = {1,2,3,4,5,6,7,8,9,10};
        Student stu = new Student("张三",18,001,"12345678", data);

        Student stu1 = (Student) stu.clone();
        stu.getArr()[0] = 100;

        System.out.println(stu);
        System.out.println(stu1);



    }

}