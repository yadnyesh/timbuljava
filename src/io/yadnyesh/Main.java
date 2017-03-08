package io.yadnyesh;

/**
 * Created by z063407 on 3/4/17.
 */

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main (String args[]) {
        int[] myIntegers = getIntegers(5);
        for(int i = 0; i < myIntegers.length; i++) {
            System.out.println("Element " + i + "is : " + myIntegers[i]);
        }
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " of integer values.");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }
}
