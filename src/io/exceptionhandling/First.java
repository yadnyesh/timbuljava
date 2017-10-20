package io.exceptionhandling;

/**
 * Created by z063407 on 10/19/17.
 */
public class First {

    public static void main(String[] args) {
        System.out.println(new Exception());
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.print("Caught!");
        } finally {
            System.out.print("Finally!");
        }
    }
}
