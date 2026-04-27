package com.yanque.Inherit;

public class Manager extends  Person{
    // 经理

    double ManagedFund;

    public Manager() {
        super();
    }

    public Manager(String id, String name, double money, double ManagedFund) {
        super(id, name, money);
        this.ManagedFund = ManagedFund;
    }

    public double getManagedFund() {
        return ManagedFund;
    }

    public void setManagedFund(double ManagedFund) {
        this.ManagedFund = ManagedFund;
    }

    @Override
    public void work() {
        System.out.println(name+"在管理其他人");
    }
}
