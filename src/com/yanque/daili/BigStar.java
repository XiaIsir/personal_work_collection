package com.yanque.daili;

public class BigStar implements Star{
    private String name;


    public BigStar() {
    }

    public BigStar(String name) {
        this.name = name;
    }


    // 唱歌
    public String sing(String name) {
        System.out.println(this.name +"正在唱"+ name);
        return "xiexie" ;
    }

    // 跳舞
    public void danc() {
        System.out.println(this.name +"正在跳舞");
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "KunGe{name = " + name + "}";
    }

}
