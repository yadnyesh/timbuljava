package io.yadnyesh;

/**
 * Created by z063407 on 3/4/17.
 */
public class Main {
    public static void main (String args[]){
        System.out.println(calculateInterest(10000.0, 2));
        System.out.println(calculateInterest(10000, 3.0));
        System.out.println(calculateInterest(10000, 4));
        System.out.println(calculateInterest(10000.0, 5.0));
       }

    public static double calculateInterest(double amount, double interestRate){
        return (amount*(interestRate/100));
    }
}
