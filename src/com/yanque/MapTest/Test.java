package com.yanque.MapTest;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        Student stu = new Student("张三",18);
        Student stu1 = new Student("李四",18);
        Student stu2 = new Student("王五",18);

        ArrayList<Student> list = new ArrayList<>();

        list.add(stu);
        list.add(stu1);
        list.add(stu2);

        for (Student s : list) {
            System.out.println(s.getName()+"->"+s.getAge());
        }


    }
}
