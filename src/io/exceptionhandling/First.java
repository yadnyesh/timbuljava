package io.exceptionhandling;

/**
 * Created by z063407 on 10/19/17.
 */
public class First extends RuntimeException{

    public static void main(String[] args) {
//        try {
//            System.out.println(10/0);
//            throw new ArithmeticException("divide by zero");
//        } catch(ArithmeticException e){
//            System.out.println(e.getMessage());
//        }

//        System.out.println(new Exception());
//        try {
//            throw new Exception();
//        } catch (Exception e) {
//            System.out.print("Caught!");
//        } finally {
//            System.out.print("Finally!");
//        }
        
        try {
            System.out.println("Hello");
        } catch(ArithmeticException e){
            System.out.println(e);
        }
        
    }
}
