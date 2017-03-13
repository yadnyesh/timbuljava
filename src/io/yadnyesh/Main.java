package io.yadnyesh;

public class Main {

    public static void main (String args[]) {
        CustomerList customer = new CustomerList("Tim", 54.96);
        CustomerList anotherCustomer = customer;
        anotherCustomer.setBalance(12.18);
        System.out.println("Balance for Customer " + customer.getName() + " is " + customer.getBalance());

    }
}

