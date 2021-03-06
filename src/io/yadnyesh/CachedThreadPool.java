package io.yadnyesh;

import io.common.LoopTaskA;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by z063407 on 7/9/17.
 */
public class CachedThreadPool {

    public static void main(String[] args) {
        System.out.println("Main thread starts here....");

        ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.execute(new LoopTaskA());
        executorService.execute(new LoopTaskA());
        executorService.execute(new LoopTaskA());
        executorService.execute(new LoopTaskA());
        executorService.execute(new LoopTaskA());
        executorService.execute(new LoopTaskA());

        executorService.shutdown();

        System.out.println("Main thread ended here .....");
    }
}
