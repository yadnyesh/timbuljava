package io.threads;

import java.util.concurrent.TimeUnit;

/**
 * Created by z063407 on 9/2/17.
 */
public class LoopTaskAB implements Runnable {

    private static int count = 0;
    private int id;

    @Override
    public void run() {
        System.out.println("############ <TASK - <" + id + "> STARTING ####");

        for (int i = 10; i > 0; i --) {
            System.out.println("TASK - <" + id + "> TICK TICK " + i);
                try {
                    TimeUnit.MILLISECONDS.sleep((long) (Math.random() * 1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
            }
        }

        System.out.println("############ <TASK - <" + id + "> DONE ####");

    }

    public LoopTaskAB() {
        this.id = ++count;
    }
}
