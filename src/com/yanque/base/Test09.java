package com.yanque.base;

public class Test09 {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 10000; i < 100000; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            int qian = i / 1000 % 10;
            int wan = i / 10000;
            if (ge == wan && shi == qian) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("以上满足条件的四位数总共有 " + count + " 个");

    }

}
