package io.yadnyesh;

import java.util.AbstractList;
import java.util.ArrayList;

public class Customer {
    private String name;
    private AbstractList<Double> transactions;

    public Customer(String name, double initialAmount) {
        this.name = name;
        this.transactions = new ArrayList<>();
        addTransaction(initialAmount);
    }

    public void addTransaction(double amount) {
        this.transactions.add(amount);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AbstractList<Double> getTransactions() {
        return transactions;
    }

    public void setTransactions(AbstractList<Double> transactions) {
        this.transactions = transactions;
    }
}
