package com.yanque.Inherit.base;

public class Phone extends SmartDevice {

    public Phone() {
        super();
    }
    public Phone(String name, double price) {
        super(name, price);
    }
    @Override
    public double payment() {
        double payment = super.payment();
        payment = payment * 0.9;
        return payment;
    }
}
