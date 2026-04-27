package com.yanque.api;

import java.io.IOException;

public class RanTimeTest {
    public static void main(String[] args) throws IOException {


        // CPU的核数
        System.out.println(Runtime.getRuntime().availableProcessors());
        // 已获取的总内存大小
        System.out.println(Runtime.getRuntime().totalMemory() / 1024 / 1024);
        // 剩余内存大小
        System.out.println(Runtime.getRuntime().freeMemory() / 1024 / 1024);
        // 总内存大小
        System.out.println(Runtime.getRuntime().maxMemory() / 1024 / 1024);
        // 运行cmd命令
        Runtime.getRuntime().exec("");
    }
}
