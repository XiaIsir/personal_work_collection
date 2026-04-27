package com.yanque.api;

public class ArrayUtil {

    private ArrayUtil() {
    }

    // 数组转字符串
    public static String ArrayToString(int arr[]){
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length-1){
                str = str+arr[i]+"]";
            }else {
                str = str+arr[i]+", ";
            }
        }
        return str;
    }
    public static String ArrayToString2(int arr[]){
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length-1){
                sb.append(arr[i]);
                sb.append("]");
            }else {
                sb.append(arr[i]);
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}
