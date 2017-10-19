package io.lamdas;

/**
 * Created by z063407 on 9/24/17.
 */
public class Sample {
    public static void main(String[] args) {

//        Thread th;
//        th = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("In Another Thread");
//            }
//        });
//
//        th = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("In Another Thread2");
//            }
//        });
//
//        th.start();

        Thread th = new Thread(() -> System.out.printf("In Another Thread"));
        th.start();
        System.out.println("In main Thread");
    }
}
