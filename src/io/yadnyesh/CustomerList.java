package io.yadnyesh;

/**
 * Created by z063407 on 3/12/17.
 */
public class CustomerList {
    private String name;
    private double balance;

    public String getName() {
        return name;
    }

    public CustomerList(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
