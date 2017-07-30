package io.datastruct;

/**
 * Created by z063407 on 7/30/17.
 */
public class BasicQueue<X> {
    private X[] data;

    public BasicQueue() {
        this(1000);
    }

    public BasicQueue(int size) {
        data = (X[]) new Object[size];
    }

}

