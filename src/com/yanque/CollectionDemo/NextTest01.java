package com.yanque.CollectionDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class NextTest01 {

    public static void main(String[] args) {

        // 创建集合
        Collection<String> coll = new ArrayList<>();
        coll.add("123");
        coll.add("456");
        coll.add("789");
        // 使用匿名内部类方式遍历
        coll.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });


        // Lambda表达式遍历集合
        //coll.forEach(s -> System.out.println(s));


    }
}
