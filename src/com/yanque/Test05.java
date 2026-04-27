package com.yanque;

public class Test05 {
    public static void main(String[] args) {


        //1.构造方法
        // 每一次都会在内存中创建新的Integer一个对象
        Integer i = new Integer(10);
        System.out.println(i);
        System.out.println("------------------------");
        //2.静态方法
        //当Integer类被加载到内存中的时候，会提前创建-128～127之间所有数据的对象，共计256个，放入到一个数组（Integer常量池）当中
        //当我们利用valueof方法获取对象的时候，判断是否在这个范围当中
        //如果在，就不会创建新的对象，而是从数组当中获取
        //如果不在，此时就会利用构造方法的方式去创建对象
        Integer i1 = Integer.valueOf(20);
        System.out.println(i1);
        System.out.println("------------------------");
        // 3.直接赋值
        Integer i2 = 30;  // 触发自动装箱->Integer i2 = Integer.valueOf(30)
        System.out.println(i2);
        System.out.println("------------------------");
        // 4.自动装箱自动拆箱
        int i3 = i2;    // 触发自动拆箱->int i3 = i2.intValue()
        System.out.println(i3);
        Integer i4 = i1 + i2; // 触发自动装箱->Integer i4 = Integer.valueOf(i1.intValue() + i2.intValue())
        System.out.println(i4);

    }
}
