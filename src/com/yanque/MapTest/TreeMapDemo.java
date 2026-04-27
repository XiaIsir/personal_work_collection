package com.yanque.MapTest;


import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {
        TreeMap<Object, Object> tm = new TreeMap<>();

        Student s1 = new Student("张三",18);
        Student s2 = new Student("李四",18);
        Student s3 = new Student("王五",18);
        Student s4 = new Student("王五",18);

        tm.put(s1,"山东");
        tm.put(s2,"湖北");
        tm.put(s3,"福建");
        tm.put(s4,"湖北");

        System.out.println(tm);
        //getSum(1,2,3,4,5,6);
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("java");
        list.add("word");
        list.add("zhangsan");
        // 打乱集合
        Collections.shuffle(list);

        System.out.println(list.get(0));

    }
    //public static void getSum(int...ages){
    //    for (int i = 0; i < ages.length; i++) {
    //        System.out.print(ages[i]+" ");
    //    }
    //}
}
