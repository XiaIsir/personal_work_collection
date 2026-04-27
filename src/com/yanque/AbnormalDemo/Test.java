package com.yanque.AbnormalDemo;

public class Test {
    public static void main(String[] args) {


        // 手动抛出异常

        int[] arr = {};
        int[] arr1 = null;
        int max = 0;

        try {
            max = arr[0];
        } catch (NullPointerException e) {
            System.out.println("空指针异常");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("索引越界异常");
        }


    }
    // 运行时异常可以不写 throws ArrayIndexOutOfBoundsException,NullPointerException
    public static void show(int[] arr) throws ArrayIndexOutOfBoundsException,NullPointerException {
        if (arr.length == 0) {
            throw new ArrayIndexOutOfBoundsException("数组长度为0");
        }
        if (arr == null) {
            throw new NullPointerException();
        }
    }
}
