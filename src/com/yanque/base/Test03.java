package com.yanque.base;

public class Test03 {
    public static void main(String[] args) {
        MobilePhone mp = new MobilePhone();
        mp.setBrand("小米");
        mp.setColor("黑色");
        mp.setPrice(3998);
        mp.call();
        mp.sendMessage();
    }
}
