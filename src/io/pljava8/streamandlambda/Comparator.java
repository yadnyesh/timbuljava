package io.pljava8.streamandlambda;

@FunctionalInterface
public interface Comparator<T> {
	public int compare(T t1, T t2);
}
