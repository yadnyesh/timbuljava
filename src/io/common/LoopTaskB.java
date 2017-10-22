package io.common;

import java.util.concurrent.TimeUnit;

/**
 * Created by z063407 on 7/9/17.
 */
public class LoopTaskB implements Runnable {
    private static int count = 0;
    private int instanceNumber;
    private String taskId;

        public void run() {
            Thread.currentThread().setName("Amazing Thread .....  " + instanceNumber);
            String currentThreadName = Thread.currentThread().getName();

            System.out.println(" #####  <TASK-" + taskId + "---" + currentThreadName + " > STARTING ########");

            for (int i = 10; i > 0; i--) {
                System.out.println("< Task " + taskId + "---" + currentThreadName + " >" + "Tick Tick " + i);
                try {
                    TimeUnit.MILLISECONDS.sleep((long)(Math.random() * 1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println(" *****  <TASK-" + taskId + " > ENDING **********");
        }

    public LoopTaskB() {
        this.instanceNumber = ++count;
        this.taskId = "LoopTaskB" + instanceNumber;
        }
}

