package com.yanque;


public class Demo01 {
    public static void main(String[] args) {
        // 创建对象
        BankAccount ba = new BankAccount("622202123456789", 1000);

        // 调试方法
        ba.deposit(-1);
        ba.withdraw(-1);

        // 调用存款方法
        ba.deposit(500);
        // 调用取款方法
        ba.withdraw(200);
        ba.withdraw(1500);

        // 输出
        String result = ba.toString();
        System.out.println(result);

    }
}
