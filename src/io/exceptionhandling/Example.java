package io.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by z063407 on 11/14/17.
 */
public class Example {

    public static void main(String[] args) {
        int result = divide();
        System.out.println(result);
    }

    private static int divide() {
        int x = getInt();
        int y = getInt();
        System.out.println("x is: " + x + ", y is: " + y);
        return x/y;
    }

    private static int getInt() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        while(true) {
            try {
                return s.nextInt();
            } catch (InputMismatchException e) {
                s.nextLine();
                System.out.println("Please enter a number - ");
            }
        }
    }



}
