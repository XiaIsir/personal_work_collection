package com.yanque.MethodTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Demo {

    public static void main(String[] args) {
        Integer arr[] = {1,2,3,4,5,6,7,8,9,10};
        //
        //Arrays.sort(arr, (a,b)->b-a);
        //// 方法引用
        //Arrays.sort(arr, Demo::funDemo);
        //
        //for (Integer i : arr) {
        //    System.out.print( i+" ");
        //}

        ArrayList<Object> list = new ArrayList<>();
        Collections.addAll(list, arr);

        list.forEach(System.out::println);

        Arrays.sort(arr, Demo::funDemo);
        list.forEach(s->System.out.print(s+" "));

    }
    public static int funDemo(int a,int b){
        return a - b;
    }
}
