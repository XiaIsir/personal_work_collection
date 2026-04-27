package com.yanque.LambdaTest;


import java.util.HashMap;
import java.util.Map;

public class Demo1 {

    public static void main(String[] args) {
        String str = "aabacd";
        Map<String, Integer> map = new HashMap<>();
        // 添加
        map.put("张三",18);
        map.put("李四",20);
        map.put("王五",20);
        map.put("小六",20);
        // 获取键对应的值
        Integer age = map.get("张三");
        System.out.println(age);
        //map.forEach(new BiConsumer<String, Integer>() {
        //    @Override
        //    public void accept(String s, Integer integer) {
        //        System.out.println(s+":"+integer);
        //    }
        //});
        // Lambda表达式
        map.forEach((k,v)-> System.out.println(k+":"+v));
        // entry遍历
        for (Map.Entry<String, Integer> keyValue : map.entrySet()){
            System.out.println(keyValue.getKey()+":"+keyValue.getValue());
        }


        //Set<String> result = map.keySet();
        //System.out.println(result);
        //map.put("name", 18);
        //map.put("张三", 18);
        //map.put("李四", 18);
        //map.put("age", 18);
        //map.put("王五", 20);
        //// 删除
        //map.remove("name");
        //map.remove("age");
        //
        //// 遍历常用方法
        //for (Map.Entry<String, Integer> entry : map.entrySet()) {
        //    System.out.println(entry.getKey() + ":" + entry.getValue());
        //}
        //// Lambda表达式遍历
        //map.forEach((k, v) -> System.out.println(k + ":" + v));
        //
        //Set<String> keys = map.keySet();
        //System.out.println( );
        //// 增强for遍历
        //for (String key : keys){
        //    Integer value = map.get( key);
        //    System.out.println(key+":"+value);
        //}
        //map.forEach((K, V) -> System.out.println(K + ":" + V));
        //map.merge(key, 1, Integer::sum);
        // 获取
        //map.put(str, map.getOrDefault(str, 0) + 1);
        //map.forEach((K, V) -> System.out.println(K + ":" + V));


    }
}
