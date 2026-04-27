package com.item.test;

public class Demo15 {
    static void main(String[] args) {
        PrintM();
    }
    public static void PrintM(){
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+"*"+i+"="+(i*j)+" ");
            }
            System.out.println();
        }
    }
}
