package io.yadnyesh;

/**
 * Created by z063407 on 4/22/17.
 */
public class ListYad<T> {
    private T[] datastore;
    private int size;
    private int pos;

    public ListYad(int numElements) {
        size = numElements;
        pos = 0;
        datastore = (T[]) new Object[size];
    }

    public void add(T element) {
        datastore[pos] = element;
        ++pos;
    }

    public String toString() {
        String elements = "";
        for (int i = 0; i < pos; ++i) {
            elements += datastore[i] + " ";
        }
        return elements;
    }
}
