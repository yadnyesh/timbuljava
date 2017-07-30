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

    public void enQueue(X item) {
        if((end + 1) % data.length == front) {
            throw new IllegalStateException("The Queue is full");
        }
        else if(size() == 0) {
            front++;
            end++;
            data[end] = item;
        }
        else {
            end++;
            data[end] = item;
        }
    }

    public X deQueue() {
        X item = null;
        if (size() == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        else if (front == end) {
            item = data[front];
            front = -1;
            end = -1;
        }
        else {
            item = data[front];
            front++;
        }
        return item;

    }
}

