package com.yanque.api;

import java.util.ArrayList;

public class ArrayListDemo02 {
    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("张无极");
        list1.add("周芷若");
        list1.add("赵敏");
        list1.add("张无");
        list1.add("张三风");


        // stream流
        list1.stream().filter(name -> name.startsWith("张"))
                .filter(name -> name.length() == 3)
                .forEach(s -> System.out.println(s));

    }
}
