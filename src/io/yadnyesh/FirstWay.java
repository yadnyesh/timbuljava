package io.yadnyesh;

import java.util.concurrent.TimeUnit;

/**
 * Created by z063407 on 6/27/17.
 */
public class FirstWay {

    public static void main(String[] args) {
        System.out.println("Main Thread starts here...");

        new FirstTask();
        Thread t = new FirstTask();

        System.out.println("Main Thread ended here....");
    }
}

class FirstTask extends Thread {

    private static int count = 0;
    private int id;

    @Override
    public void run() {
        for(int i = 10; i > 0; i--) {
            System.out.println("Tick Tick " + i);
            try {
                TimeUnit.MILLISECONDS.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public FirstTask() {
        this.id = ++count;
        this.start();
    }
}
