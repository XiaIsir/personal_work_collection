package com.yanque.MapTest;


import java.util.HashMap;
import java.util.Map;

public class Demo3 {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("张三", 80);
        map.put("李四", 95);
        map.put("王五", 88);
        // 最大值初始化
        int maxScore = Integer.MAX_VALUE;
        // 最小值初始化
        int minScore = Integer.MIN_VALUE;
        
        String maxName = "";

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > minScore) {
                maxScore = entry.getValue();
                maxName = entry.getKey();
            }
        }

        System.out.println("最高分：" + maxName + " = " + maxScore);
    }
}
