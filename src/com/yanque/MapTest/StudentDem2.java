package com.yanque.MapTest;


public class StudentDem2 {

    public static void main(String[] args) {
        Student stu = new Student();
        Teacher teacher = new Teacher("张三", 18);

        int age = teacher.getAge();
        System.out.println(age);
        teacher.show();

    }
}
