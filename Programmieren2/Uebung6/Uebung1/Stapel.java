package Uebung6.Uebung1;

import java.util.Iterator;

public interface Stapel <T> extends Iterable<T> {
    int size();
    boolean isEmpty();
    T top();
    void push(T e);
    void pop();
}
