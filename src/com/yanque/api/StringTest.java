package com.yanque.api;

import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        // 键盘录入用户名和密码
        Scanner sc = new Scanner(System.in);
        // 定义已知正确的用户名和密码
        String rightUsername = "admin";
        String rightPassword = "123456";
        System.out.println("请输入用户名和密码：");
        String username = sc.next();
        String password = sc.next();
        int count = 1;
        // 判断用户名和密码是否正确
        while (count <= 3) {
            boolean result = username.equals(rightUsername) && password.equals(rightPassword);
            //如果对布尔类型的变量进行判断的时候，不建议写==
            //建议：如果对布尔类型的变量进行判断，建议直接把变量写在小括号当中
            //表示：判断变量里面记录的值是真还是假，如果是真执行if，如果是假执行else
            if (result) {
                System.out.println("登录成功！");
                break;
            } else {
                System.out.println("登录失败！还剩" + (3 - count) + "次机会！");
                System.out.println("用户名或密码错误，请重新输入：");
                username = sc.next();
                password = sc.next();

            }
            count++;
        }
        System.out.println("登录失败！");
    }
}
