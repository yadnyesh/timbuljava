package io.yadnyesh;

import java.util.concurrent.TimeUnit;

public class FourthWay {

    public static void main(String[] args) {
        System.out.println("Main Thread starts here...");

        new FourthTask();
        new FourthTask();

        System.out.println("Main Thread ended here....");
    }
}

class FourthTask implements Runnable {

    private static int count = 0;
    private int id;

    @Override
    public void run() {
        for(int i = 10; i > 0; i--) {
            System.out.println("< " + id + " >" + "Tick Tick " + i);
            try {
                TimeUnit.MILLISECONDS.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public FourthTask() {
        this.id = ++count;
        new Thread(this).start();
    }
}
