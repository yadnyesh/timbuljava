package io.datastruct;

/**
 * Created by z063407 on 7/29/17.
 */
public class BasicStack<X> {
    private X[] data;
    int stackPointer;

    public BasicStack() {
        data = (X[]) new Object[1000];
    }

    public void push(X newItem) {
        data[stackPointer++] = newItem;

    }

    public X pop () {
        if (stackPointer == 0) {
            throw new IllegalStateException("No more items on the Stack!");
        }
        return data[stackPointer--];
    }
}