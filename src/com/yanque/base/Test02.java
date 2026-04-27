package com.yanque.base;

public class Test02 {
    public static void main(String[] args) {
    /*  请在测试类中创建对象并给成员变量赋值，然后分别调用展示方法、洗衣服方法和做饭方法。打印效果如下：
        我女朋友叫XXX,身高165.0厘米,体重130.0斤
        XXX帮我洗衣服
        XXX给我做饭*/
        TongTong tt = new TongTong();
        tt.setHeight(180);
        tt.setName("小彤");
        tt.setWeight(50);
        tt.show();
        tt.wash();
        tt.cook();
        System.out.println("-------------------");
        TongTong tt1 = new TongTong("小彤", 180, 50);
        tt1.show();
        tt1.wash();
        tt1.cook();
    }
}
