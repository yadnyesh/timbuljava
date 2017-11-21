package io.datastruct;


import java.lang.reflect.Array;

public class Queue<T> {

    private static final int SPECIAL_EMPTY_VALUE = -1;
    private static int MAX_SIZE = 40;
    private T[] elements;

    private int headIndex = SPECIAL_EMPTY_VALUE;
    private int tailIndex = SPECIAL_EMPTY_VALUE;

    public Queue(Class<T> clazz) {
        elements = (T[]) Array.newInstance(clazz, MAX_SIZE);
    }

    public static class QueueOverflowException extends Exception {

    }

    public static class QueueUnderflowException extends Exception {

    }

    public boolean isEmpty() {
        return headIndex == SPECIAL_EMPTY_VALUE;
    }

    public boolean isFull(){
        int nextIndex = (tailIndex + 1) % elements.length;
        return nextIndex == headIndex;
    }
}
