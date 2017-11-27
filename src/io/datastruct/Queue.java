package io.datastruct;

import java.lang.reflect.Array;

public class Queue<T> {

    private static final int SPECIAL_EMPTY_VALUE = -1;
    private static int MAX_SIZE = 40;
    private T[] elements;

    private int headIndex = SPECIAL_EMPTY_VALUE;
    private int tailIndex = SPECIAL_EMPTY_VALUE;

    public Queue(Class<T> clazz) {this (clazz, MAX_SIZE);}

    public Queue(Class<T> clazz, int size) {
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

    public void enqueue(T data) throws QueueOverflowException {
        if (isFull()) {
            throw new QueueOverflowException();
        }
        tailIndex = (tailIndex + 1) % elements.length;
        elements[tailIndex] = data;

        if (headIndex == SPECIAL_EMPTY_VALUE) {
            headIndex = tailIndex;
        }
    }

    public T dequeue() throws QueueUnderflowException {
        if(isEmpty()){
            throw new QueueUnderflowException();
        }

        T data = elements[headIndex];

        if(headIndex == tailIndex) {
            headIndex = SPECIAL_EMPTY_VALUE;
        } else {
            headIndex = (headIndex + 1) % elements.length;
        }

        return data;
    }

    public boolean offer(T data) {
        if(isFull()) {
            return false;
        }
        try {
            enqueue(data);
        } catch(QueueOverflowException que) {
            System.out.println(que);
        }
        return true;
    }

    public T peek() throws QueueUnderflowException {
        if(isEmpty()) {
            throw new QueueUnderflowException();
        }
        return elements[headIndex];
    }

    public static void main(String[] args) throws QueueOverflowException, QueueUnderflowException{
        MAX_SIZE = 4;
        Queue<Integer> queue = new Queue<>(Integer.class);
        System.out.println("1.Queue full?: " + queue.isFull());
        System.out.println("1.Queue empty?: " + queue.isEmpty());

        try {
            queue.enqueue(1);
            queue.enqueue(2);
            queue.enqueue(3);
        } catch (QueueOverflowException queueOverflowException) {
            System.out.println("Queue Full..cannot accept more items");
        }

        System.out.println("2.Queue full?: " + queue.isFull());
        System.out.println("2.Queue empty?: " + queue.isEmpty());

        queue.enqueue(4);

        System.out.println("3.Queue full?: " + queue.isFull());
        System.out.println("3.Queue empty?: " + queue.isEmpty());

        System.out.println("1. Queue Peek: " + queue.peek());

        int deQueuedElememt = queue.dequeue();
        System.out.println("Dequeued Element: " + deQueuedElememt);

        System.out.println("2. Queue Peek: " + queue.peek());

        try {
            queue.enqueue(4);
            queue.enqueue(5);
            queue.enqueue(6);
        } catch (QueueOverflowException queueOverflowException){
            System.out.println(queueOverflowException);
        }

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());


    }
}
