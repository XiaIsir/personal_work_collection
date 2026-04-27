package com.yanque.base;

public class TongTong {
/*    定义一个女朋友类。
    女朋友的属性包含：姓名，身高，体重。行为包含：洗衣服wash()，做饭cook()。另外定义一个用于展示三个属性值的show()方法。*/
    private String name;
    private int height;
    private int weight;
    public void wash(){
        System.out.println("女朋友开始洗衣服");
    }
    public void cook(){
        System.out.println("女朋友开始做饭");
    }
    public void show(){
        System.out.println("女朋友的名字是：" + name + "，身高是：" + height + "，体重是：" + weight);
    }

    public TongTong() {
    }

    public TongTong(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
