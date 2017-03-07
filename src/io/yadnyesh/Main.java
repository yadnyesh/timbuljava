package io.yadnyesh;

/**
 * Created by z063407 on 3/4/17.
 */
public class Main {
    public static void main (String args[]) {
//        Car porsche = new Car();
//        Car holden = new Car();
//
//        porsche.setModel("911");
//        //System.out.println("Model is " + porsche.getModel());

        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount(12345, 0.00, "Yadnyesh", "yadnyesh.juvekar@gmail.com", "34534");

        System.out.println("The Balance after deposit is " + account1.getBalance());

        account2.getBalance();
        account2.deposit(500);
        System.out.println("The Balance after deposit is " + account2.getBalance());
        account2.withdraw(501);
        System.out.println("The Balance after withdrwal is " + account2.getBalance());


    }
}
