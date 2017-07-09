package io.yadnyesh;

import java.util.concurrent.TimeUnit;

/**
 * Created by z063407 on 7/9/17.
 */
public class FifthWay {

    public static void main(String[] args) {
        System.out.println("Main Thread Starts here..");

        new Thread(new Runnable() {
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
        }).start();

        System.out.println("Main Thread ends here....");
    }
}
