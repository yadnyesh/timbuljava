package io.exceptionhandling;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = 98;
        int y= 0;
        System.out.println(divideLBYL(x, y));
        System.out.println(divideEAFP(x, y));
    }

    private static int getInt() {
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }


    private static int divideLBYL (int x, int y){
        if(y != 0){
            return x/y;
        } else {
            return 0;
        }
    }

    private static int divideEAFP(int x, int y) {
        try {
            return x / y;
        } catch (ArithmeticException e){
            return 0;
        }
    }

    private static int divide (int x, int y) {
        return x /y;
    }
}
