package com.yanque.MapTest;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StudentDemo {

    public static void main(String[] args) {
        Map<Student, String> map = new HashMap<>();

        Student s1 = new Student("张三",18);
        Student s2 = new Student("李四",18);
        Student s3 = new Student("王五",18);
        Student s4 = new Student("王五",18);

        map.put(s1,"山东");
        map.put(s2,"湖北");
        map.put(s3,"福建");
        map.put(s4,"湖北");

        //map.forEach((k,v)-> System.out.println(k+":"+v));

        Set<Student> keys = map.keySet();
        for (Student key : keys){
            String value = map.get( key);
            System.out.println(key+":"+value);
        }

    }
}
