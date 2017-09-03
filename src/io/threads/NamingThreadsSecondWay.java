package io.threads;

import io.common.LoopTaskC;

/**
 * Created by z063407 on 9/3/17.
 */
public class NamingThreadsSecondWay {
    public static void main(String[] args) {

        String currentThreadName = Thread.currentThread().getName();

        System.out.println(currentThreadName + " starts here....");

        new Thread(new LoopTaskC(), "My Thread-1").start();

        Thread t2 = new Thread(new LoopTaskC());
        t2.setName("My Thread -2");
        t2.start();

        System.out.println(currentThreadName + " ended ......");
    }


}
