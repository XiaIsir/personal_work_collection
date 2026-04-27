package com.yanque.FileDemo;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class Demo {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\Java_Test\\HelloWorld\\student_info.txt");
        // 判断文件是否存在
        System.out.println(file.exists());
        // 获取文件名
        System.out.println(file.getName());
        // 获取文件大小 单位字节 无法获取文件夹的大小
        System.out.println(file.length());
        // 获取文件父目录
        System.out.println(file.getParent());
        // 获取文件绝对路径
        System.out.println(file.getAbsolutePath());
        // 获取文件相对路径
        System.out.println(file.getPath());
        // 判断文件是否可读
        System.out.println(file.canRead());
        // 判断文件是否可写
        System.out.println(file.canWrite());
        // 获取文件最后修改时间（毫秒值）
        System.out.println(file.lastModified());
        // 把获取的时间改成格式为年yyyy月hh日mm日ss时mm分ss秒
        System.out.println(new java.util.Date(file.lastModified()));
        String format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(file.lastModified());
        System.out.println(format);
        System.out.println();

        // 获取文件的后缀名
        String f = file.getName().substring(file.getName().lastIndexOf(".") + 1);
        System.out.println(f);
        // 文件创建
        File file1 = new File("D:\\Java_Test\\HelloWorld\\student_info1.txt");
        File file2 = new File("D:\\Java_Test\\HelloWorld\\aaa\\ddd");
        //// 创建一个空的文件
        //System.out.println(file1.createNewFile());
        //// 文件夹或文件删除 默认删除之后不走回收站
        //System.out.println(file1.delete());
        //// 创建文件夹
        //System.out.println(file1.mkdir());
        // 创建多级文件夹
        System.out.println(file2.mkdirs());
    }
}
