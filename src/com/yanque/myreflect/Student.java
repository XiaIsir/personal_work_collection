package com.yanque.myreflect;

import java.util.Objects;

//Cloneable
//如果一个接口里面没有抽象方法
//表示当前的接口是一个标记性接口
//现在cloneable表示一旦了实现，那么当前类的对象就可以被克隆
//如果没有实现，当前类的对象就不能克隆
public class Student implements Cloneable{
    private String name;
    private int age;
    // id
    private int id;
    // 密码
    private String pwd;
    private  int[] arr;


    public Student() {
    }

    private Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private Student(String name, int age, int id, String pwd) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.pwd = pwd;
    }

    public Student(String name, int age, int id, String pwd, int[] arr) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.pwd = pwd;
        this.arr = arr;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }



    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     * @return pwd
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * 设置
     * @param pwd
     */
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    /**
     * 判断两个对象是否相等
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }
    // 重写toString方法打印对象的属性值
    public String toString() {
        if (this.arr == null){
            return "Student{name = " + name + ", age = " + age + "}";
        }
        String arr = "[";
        for (int i = 0; i < this.arr.length; i++) {
            if (i != this.arr.length - 1){
                arr += this.arr[i] + ", ";
            } else {
                arr += this.arr[i] + "]";
            }
        }
        return "Student{name = " + name + ", age = " + age + arr + "}";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student stu = (Student) super.clone();
        if (this.arr != null) {
            // 创建新的数组
            stu.arr = this.arr.clone();
        }
        return stu;
    }


    public void show(String name) {
        System.out.println("show方法");
    }
    /**
     * 获取
     * @return arr
     */
    public int[] getArr() {
        return arr;
    }

    /**
     * 设置
     * @param arr
     */
    public void setArr(int[] arr) {
        this.arr = arr;
    }
}
