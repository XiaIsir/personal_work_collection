package com.yanque;

// 银行账户类
public class BankAccount {
    // 账号
    private String accountNumber;
    // 余额
    private double balance;

    // 无参构造
    public BankAccount() {
        this.accountNumber = "000000";
    }

    // 满参构造
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // 存钱方法
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("存款金额无效");
            return;
        }
        this.balance += amount;
    }

    // 取钱方法
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("取款金额无效");
            return;
        }
        if (amount > balance) {
            System.out.println("余额不足");
            return;
        }
        this.balance -= amount;
        System.out.println(amount + "取款成功，剩余余额：" + this.balance);
    }

    /**
     * 获取
     *
     * @return accountNumber
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * 获取
     *
     * @return balance
     */
    public double getBalance() {
        return balance;
    }


    public String toString() {
        return "账号：" + accountNumber + ", 余额：" + balance;
    }
}
