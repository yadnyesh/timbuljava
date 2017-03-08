package io.yadnyesh;

/**
 * Created by z063407 on 3/4/17.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main (String args[]) {
        int[] myIntegers = getIntegers(5);
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);

//        for(int i = 0; i < myIntegers.length; i++) {
//            System.out.println("Element " + i + "is : " + myIntegers[i]);
//        }
    }

    public static int[] getIntegers(int capacity) {
        System.out.println("Enter " + capacity + " of integer values.");
        int[] array = new int[capacity];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + "is : " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
//        int[] sortedArray = new int[array.length];
//        for(int i=0; i < array.length; i++) {
//            sortedArray[i] = array[i];
//        }

        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for(int i=0; i < sortedArray.length-1; i++){
                if(sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }


        return sortedArray;
    }

}

