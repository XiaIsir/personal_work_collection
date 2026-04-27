package com.yanque.api;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList< String> list = new ArrayList<>();
        // 集合添加
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add(0,"!");
        // 集合删除
        System.out.println(list);
        boolean result = list.remove("hello");
        System.out.println( result);
        String re = list.remove(1);
        System.out.println(re);
        // 集合修改
        list.set(0,"java");
        System.out.println(list);

        // 集合查询
        String ab = list.get(1);
        System.out.println( list);
    }
}
