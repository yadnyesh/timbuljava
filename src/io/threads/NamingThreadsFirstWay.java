package io.threads;

import io.common.LoopTaskB;

/**
 * Created by z063407 on 9/3/17.
 */
public class NamingThreadsFirstWay {
    public static void main(String[] args) {

        String currentThreadName = Thread.currentThread().getName();

        System.out.println(currentThreadName + " starts here....");

        new Thread(new LoopTaskB()).start();

        Thread t2 = new Thread(new LoopTaskB());
        t2.start();

        System.out.println(currentThreadName + " ended ......");
    }


}
