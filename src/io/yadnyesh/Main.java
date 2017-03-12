package io.yadnyesh;

public class Main {

    public static void main (String args[]) {
        Bank bank = new Bank("Canara Bank");
        bank.addBranch("Goa");
        bank.addCustomer("Goa", "Yadnyesh", 4000.00);
        bank.addCustomer("Goa", "Bindiya", 400.50);
        bank.addCustomer("Goa", "Varada", 500.50);

        bank.addBranch("Marcela");
        bank.addCustomer("Marcela", "Bob", 100.00);

        bank.addCustomerTransaction("Goa", "Yadnyesh", 100.99);
        bank.addCustomerTransaction("Goa", "Yadnyesh", 200.99);
        bank.addCustomerTransaction("Goa", "Bindiya", 200.99);

        bank.listCustomers("Goa", true);
    }
}

