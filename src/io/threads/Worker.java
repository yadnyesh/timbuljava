package io.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by z063407 on 3/9/17.
 */
public class Worker {

    private Random random = new Random();

    private List<Integer> list1 = new ArrayList<Integer>();
    private List<Integer> list2 = new ArrayList<Integer>();





    public void main() {
        System.out.println(new Random().nextInt(100));
    }
}
