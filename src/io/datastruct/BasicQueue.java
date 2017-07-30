package io.datastruct;

/**
 * Created by z063407 on 7/30/17.
 */
public class BasicQueue<X> {
    private X[] data;
    private int front;
    private int end;

    public BasicQueue() {
        this(1000);
    }

    public BasicQueue(int size) {
        data = (X[]) new Object[size];
        this.front = -1;
        this.end = -1;
    }

    public int size()   {
        if (front == -1 && end == -1) {
            return 0;
        }
        else {
            return front - end + 1;
        }
    }
}

