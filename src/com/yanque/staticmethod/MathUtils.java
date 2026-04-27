package com.yanque.staticmethod;
/**
 * 数学工具类
 */
public class MathUtils {
    // 私有构造,防止实例化
    private MathUtils() {
    }
    //如果方法的功能与具体对象无关,只是纯粹的功能计算,就用 static!
    //   System.out.println(MathUtils.add(10, 5));      // 15
    public static int add(int a, int b) {
        return a + b;
    }
    public static int sub(int a, int b) {
        return a - b;
    }
}
