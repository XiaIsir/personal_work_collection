package com.yanque.FileDemo;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Arrays;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        // 文件创建
        File file1 = new File("D:\\Java_Test\\HelloWorld\\student_info1.txt");
        File file2 = new File("D:\\Java_Test\\HelloWorld");


        // 获取并遍历
        File[] files = file2.listFiles();
        for (File f1 : files) {
            System.out.println(f1);
        }
        System.out.println("--------------------------------");

        File[] filesArr = file2.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isFile() && pathname.getName().endsWith(".txt");
            }
        });
        System.out.println(Arrays.toString(filesArr));

    }

}
