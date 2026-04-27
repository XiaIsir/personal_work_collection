package com.yanque.CollectionDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class NextTest {

    public static void main(String[] args) {

        Collection<String> coll = new ArrayList<>();
        coll.add("123");
        coll.add("456");
        // 添加元素
        coll.add("789");
        // 删除集合中的元素
        coll.remove("123");
        coll.remove("456");
        // 获取集合的长度
        System.out.println(coll.size());

        // 判断元素是否包含
        System.out.println(coll.contains("789"));
        coll.add("000");
        System.out.println(coll.contains("000"));
        // 获取集合的长度
        System.out.println(coll.size());
        coll.clear();
        // 判断集合是否为空
        System.out.println(coll.isEmpty());

        // 创建迭代器 好比一个箭头指向集合中的0索引处
        Iterator<String> it = coll.iterator();
        // it.hasNext()的作用是不断获取集合的元素，当集合元素不存在时，返回false
        while (it.hasNext()) {
            // it.next()的作用是获取集合中的元素并移动指针
            String n = it.next();
            System.out.println(n);
        }
    }
}
