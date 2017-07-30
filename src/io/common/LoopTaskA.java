package io.common;

import java.util.concurrent.TimeUnit;

/**
 * Created by z063407 on 7/9/17.
 */
public class LoopTaskA implements Runnable {
    private static int count = 0;
    private int id;

        public void run() {
            System.out.println(" #####  <TASK-" + id + " > STARTING ########");

            for (int i = 10; i > 0; i--) {
                System.out.println("< Task " + id + " >" + "Tick Tick " + i);
                try {
                    TimeUnit.MILLISECONDS.sleep((long)(Math.random() * 1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println(" *****  <TASK-" + id + " > ENDING **********");
        }

    public LoopTaskA() {
            this.id = ++count;
        }
}

