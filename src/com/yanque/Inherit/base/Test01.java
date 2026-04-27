package com.yanque.Inherit.base;

public class Test01 {

    public static void main(String[] args) {
        Zi2 zi2 = new Zi2();
        zi2.name = "张三";
        zi2.show();
        new Fu().show();

    }

}

class Fu{
    String name;
    int age;
    public void show(){
        System.out.println("父类方法"+name);
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Zi extends Fu{
    public void show(){
        System.out.println("子类方法");
    }
}

class Zi2 extends Zi{
    public void show(){
        System.out.println("子类方法2");
        super.show();
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}