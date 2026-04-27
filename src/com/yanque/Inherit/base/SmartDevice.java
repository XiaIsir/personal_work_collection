package com.yanque.Inherit.base;

public class SmartDevice {
    String name;
    double price;

    public SmartDevice(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public SmartDevice() {
    }

    public double payment() {
            /*
        (0 ～1000）元，不打折
        (1000～5000）元，9折
        (5000～10000）元，8折
        (10000元及以上，7折*/
        if (price > 0 && price <= 1000) {
            return price;
        } else if (price > 1000 && price <= 5000) {
            return price * 0.9;
        } else if (price > 5000 && price <= 10000) {
            return price * 0.8;
        } else if (price > 10000) {
            return price * 0.7;
        } else {
            return 0;
        }
    }
}
