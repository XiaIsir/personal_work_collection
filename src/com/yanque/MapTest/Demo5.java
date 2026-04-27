package com.yanque.MapTest;


import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class Demo5 {

    public static void main(String[] args) {
        String text = "java is good java is easy";
        Map<String, Integer> map = new HashMap<>();

        String[] words = text.split(" ");
        for (String word : words) {
            map.put(word,map.getOrDefault(word, 0)+1);
        }

        map.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String s, Integer integer) {
                System.out.println(s+":"+integer);
            }
        });

    }
}
