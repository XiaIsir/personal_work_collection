package com.yanque.MapTest;


import java.util.HashMap;
import java.util.Map;

public class Demo6 {

    public static void main(String[] args) {
        String text = "java is good java is easy java";
        Map<String, Integer> map = new HashMap<>();

        String[] words = text.split(" ");
        for (String word : words) {
            map.merge(word, 1, Integer::sum);
        }

        // 最大值初始化
        int maxScore = Integer.MIN_VALUE;
        // 最小值初始化
        int minScore = Integer.MAX_VALUE;
        String name = "";

        for(Map.Entry entry : map.entrySet()){
            if((int)entry.getValue() > maxScore){
                maxScore = (int)entry.getValue();
                name = (String)entry.getKey();
            }
        }

        System.out.println("最大值：" + name + " = " + maxScore);



    }
}
