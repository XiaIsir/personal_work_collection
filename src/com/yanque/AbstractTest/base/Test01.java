package com.yanque.AbstractTest.base;

public class Test01 {
    public static void main(String[] args) {

        Animal animal = new AnimalApusicImpl();
        animal.eat();
        Cat cat = new Cat("猫", 3);
        cat.swim();
        cat.eat();
    }
}
