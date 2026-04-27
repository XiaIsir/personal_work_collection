package com.yanque;

// 工具类
public interface StringHelper {

    // concat方法
    public static String concat(String a, String b) {
        return a + "," + b;
    }

    // concat方法重载
    public static String concat(String a, String b, String c) {
        return a + "," + b + "," + c;
    }

    public static String repeat(String s, int n) {
        if (n <= 0) {
            return "";
        }
        String result = "";
        for (int i = 0; i < n; i++) {
            if (i != n - 1) {
                result += s + ",";
            }else{
                result += s;
            }

        }
        return result;
    }

}
