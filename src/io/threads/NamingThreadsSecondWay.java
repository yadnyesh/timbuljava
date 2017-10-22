package io.threads;

import io.common.LoopTaskC;

import java.util.concurrent.TimeUnit;

/**
 * Created by z063407 on 9/3/17.
 */
public class NamingThreadsSecondWay {
    public static void main(String[] args) {

        String currentThreadName = Thread.currentThread().getName();

        System.out.println(currentThreadName + " starts here....");

        new Thread(new LoopTaskC(), "My Thread-1").start();

        Thread t2 = new Thread(new LoopTaskC());

        t2.start();
        try {
            TimeUnit.MILLISECONDS.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.setName("My Thread -2");
        System.out.println(currentThreadName + " ended ......");
    }


}
