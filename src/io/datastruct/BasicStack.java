package io.datastruct;

/**
 * Created by z063407 on 7/29/17.
 */
public class BasicStack<X> {
    private X[] data;
    int stackPointer = 0;

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

    public boolean contains(X item) {
        boolean found = false;
        for (int i = 0; i < stackPointer; i++) {
            if(data[i].equals(item)) {
                found = true;
                break;
            }
        }
        return found;
    }

    public X access (X item) {
        while(stackPointer > 0) {
            X tmpItem = pop();
            if(item.equals(tmpItem)) {
                return tmpItem;
            }
        }
        throw new IllegalArgumentException("Could not find " + item + " on the stack");
    }

    public int size() {
        return stackPointer;
    }
}