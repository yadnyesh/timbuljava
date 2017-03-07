package io.yadnyesh;

/**
 * Created by z063407 on 3/7/17.
 */
public class BankAccount {
    private int accountNumber;
    private double balance = 0;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        this(6575, 0.00, "Default", "Default", "000");
        System.out.println("Empty Constructor called");
    }

    public BankAccount (int accountNumber, double balance, String customerName, String email, String phoneNumber) {
        System.out.println("Non-Empty Constructor called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double  printBalance (){
       return this.getBalance();
    }

    public void deposit(double depositAmount) {
        double totalBalance = this.getBalance() + depositAmount;
        this.setBalance(totalBalance);
        //System.out.println("Total Balance after deposit is :" + this.getBalance());
    }

    public void withdraw (double withdrawAmount) {
        double currentBalance = this.getBalance();
        if (currentBalance >= withdrawAmount) {
            this.setBalance(currentBalance - withdrawAmount);
        } else {
            System.out.println("Insufficient Balance");
        }
        //System.out.println("Total Balance after withdrawal is :" + this.getBalance());
    }
}
