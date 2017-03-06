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

        for(int i=0; i<5; i++) {
            System.out.println("Loop " + i + " hello");
        }

        for (int i=8; i > 1; i--){
            System.out.println(String.format("%.2f", calculateInterest(10000.0, i)));
        }
    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount*(interestRate/100));
    }
}
