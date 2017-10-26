package io.threads;

import java.util.concurrent.TimeUnit;

/**
 * Created by z063407 on 10/27/17.
 */
public class MyFirstThread {

    public static void main(String[] args) {
        Task task = new Task();
        Thread thread = new Thread(task);
        thread.start();

        try {
            //Thread.sleep(3000);
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Inside main...");
    }
}

class Task implements Runnable {
    @Override
    public void run() {
        System.out.println("Inside run....");
        go();

    }

    private void go() {
        System.out.println("Inside go...");
        more();
    }

    private void more() {
        System.out.println("Inside more...");
    }
}