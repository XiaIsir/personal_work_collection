package com.yanque.api;

import java.util.ArrayList;

public class Student {
    private String name;
    private int age;
    private String id ;

    public Student() {
    }

    public Student(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    // 根据id查找某个学生的信息
    public  static int findStudentInfo(String id, ArrayList< Student> list){
        for (int i = 0; i < list.size(); i++) {
            // 获取集合中的元素
            Student stu = list.get(i);
            if(stu.getId().equals(id)){
                return i;
            }
        }
        return -1;
    }
}
