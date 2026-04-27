package com.yanque.MapTest;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo4 {

    public static void main(String[] args) {
        Map<String, List<String>> map = new HashMap<>();
        // 重点
        map.computeIfAbsent("一班",k ->new ArrayList<>()).add("张三");
        map.computeIfAbsent("二班",k ->new ArrayList<>()).add("李四");
        map.computeIfAbsent("二班",k ->new ArrayList<>()).add("王五");
        //map.get("一班").add("张三");
        //map.get("一班").add("李四");
        //map.get("二班").add("王五");

        map.forEach((k,v)-> System.out.println(k+"->"+v));
    }
}
