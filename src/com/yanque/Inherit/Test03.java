package com.yanque.Inherit;

public class Test03 {
    public static void main(String[] args) {
        Manager m = new Manager("01", "张三", 15000, 5000);
        Cook c = new Cook("02", "李四", 8000);
        Cook c3 = new Cook("02", "李四", 8000);
        m.work();
        c.work();
        c.eat();
        System.out.println("---------------------");
        //多态
        // 父类引用指向子类对象
        // 向上转型
        Person p1 = c;
        p1.work();

        Person p2 = m;
        p2.work();

        // 多态向下转型
        System.out.println("------------------");
        System.out.println("------------------");

        // 判断对象是否是某个类的实例
        if (p1 instanceof Cook) {
            Cook c1 = (Cook) p1;
            c1.work();
        }else if (p2 instanceof Manager){
            Manager m1 = (Manager) p2;
            m1.work();
            System.out.println("管理基金:"+m1.getManagedFund());
        }
    }
}


