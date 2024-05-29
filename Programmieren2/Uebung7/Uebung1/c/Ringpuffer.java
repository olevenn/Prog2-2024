package Uebung7.Uebung1.c;

public interface Ringpuffer<T> {

    int size();
    int capacity();
    boolean isEmpty();
    boolean contains(T e);
    void add(T e);
    T get();
    void remove();
}
