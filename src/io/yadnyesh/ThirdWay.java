package io.yadnyesh;


import java.util.concurrent.TimeUnit;

public class ThirdWay {

    public static void main(String[] args) {
        System.out.println("Main Thread starts here...");

        new ThirdTask();
        Thread t = new ThirdTask();

        System.out.println("Main Thread ended here....");
    }
}

class ThirdTask extends Thread {

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

    public ThirdTask() {
        this.id = ++count;
        this.start();
    }
}
