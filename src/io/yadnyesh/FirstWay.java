package io.yadnyesh;

/**
 * Created by z063407 on 6/27/17.
 */
public class FirstWay {

    public static void main(String[] args) {
        new FirstTask();
    }
}

class FirstTask extends Thread {

    public void run() {
        for(int i = 10; i > 0; i--) {
            System.out.println("Tick Tick " + i);
        }
    }

    public FirstTask() {
        this.start();
    }
}
