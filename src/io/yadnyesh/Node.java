package io.yadnyesh;

/**
 * Created by z063407 on 4/23/17.
 */
public class Node<T> {
    private T data;
    public Node next;

    public Node(T data) {
        this.data = data;
        next = null;
    }

    T getData() {
        return data;
    }
}
