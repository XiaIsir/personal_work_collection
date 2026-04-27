package com.yanque.AbstractTest;

import java.util.ArrayList;

public class IntegerDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Integer i = 20;

        list.add(i);
        list.add(10);
        list.add(30);
        System.out.print("[");

        for (int i1 = 0; i1 < list.size(); i1++) {
            if(i1 != list.size()-1){
                System.out.print(list.get(i1)+", ");
            }else{
                System.out.print(list.get(i1)+"]");
            }
        }
    }
}
