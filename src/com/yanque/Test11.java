package com.yanque;

public class Test11 {
    public static void main(String[] args) {

        double[] arr = {12.5, 8.0, 9.5, 11.0, 13.5, 20.0, 15.5};

        double total = 0;
        int count = 0;

        for (double d : arr) {
            total += d;
            if (d >= 12){
                count++;
            }
        }
        // 平均营业额
        double avg = total / arr.length;
        System.out.println("总营业额为：" + String.format("%.2f", total));
        System.out.println("平均营业额为：" + String.format("%.2f", avg));
        System.out.println("营业额大于12的天数有：" + count + "天");

    }
}
