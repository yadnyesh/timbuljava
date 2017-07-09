package io.common;

import java.util.concurrent.TimeUnit;

/**
 * Created by z063407 on 7/9/17.
 */
public class LoopTaskA implements Runnable {
    private static int count = 0;
    private int id;

        public void run() {
            for (int i = 10; i > 0; i--) {
                System.out.println("< " + id + " >" + "Tick Tick " + i);
                try {
                    TimeUnit.MILLISECONDS.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    public LoopTaskA() {
            this.id = ++count;
        }
}

