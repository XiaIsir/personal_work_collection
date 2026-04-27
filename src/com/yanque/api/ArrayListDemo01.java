package com.yanque.api;

import java.util.ArrayList;

public class ArrayListDemo01 {
    public static void main(String[] args) {

        ArrayList< Student> list = new ArrayList<>();

        Student s1 = new Student("小王", 18,"001");
        Student s2 = new Student("张三", 20,"002");
        Student s3 = new Student("里斯", 30,"003");

        list.add(s1);
        list.add(s2);
        list.add(s3);

        int result = Student.findStudentInfo("003", list);
        System.out.println(result);

    }
}
