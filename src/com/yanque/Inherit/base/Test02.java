package com.yanque.Inherit.base;

public class Test02 {
    public static void main(String[] args) {
        Phone phone = new Phone("xiaomi", 5000);
        double payment = phone.payment();
        System.out.println(payment);
        System.out.println(phone.price);
        System.out.println(phone.name);
    }
}
