package io.threads;

import io.common.LoopTaskA;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by z063407 on 9/2/17.
 */
public class UsingSingleThreadExecutor {
    public static void main(String[] args) {
        System.out.println("Main thread starts here ....");

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        executorService.execute(new LoopTaskA());
        executorService.execute(new LoopTaskA());
        executorService.execute(new LoopTaskA());
//        executorService.execute(new LoopTaskA());
//        executorService.execute(new LoopTaskA());
//        executorService.execute(new LoopTaskA());

        executorService.shutdown();

        //executorService.execute(new LoopTaskA());

        System.out.println("Main Thread ends here");

    }
}
