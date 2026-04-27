package com.yanque.MapTest;


import java.util.HashMap;

public class Demo1 {

    public static void main(String[] args) {

        String str = "abcaabc";
        HashMap<Character, Integer> map = new HashMap<>();
        // 统计字符出现次数
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        //map.forEach((k,v)-> System.out.println(k+":"+v));
        map.getOrDefault("a",0);

        map.forEach((k,v)-> System.out.println(k+":"+v));
        //map.put(c,map.getOrDefault(c,0)+1);
        //map.forEach((k,v)-> System.out.println(k+":"+v));

    }
}
