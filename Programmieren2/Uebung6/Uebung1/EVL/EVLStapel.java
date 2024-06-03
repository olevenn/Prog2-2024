package Uebung6.Uebung1.EVL;

import Uebung6.Uebung1.Stapel;

import java.util.Iterator;

public class EVLStapel<T> implements Stapel<T> {

    private EVL<T> elements;

    public EVLStapel() {
        elements = new EVL<>();
    }

    @Override
    public int size() {
        return elements.size();
    }

    @Override
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    @Override
    public T top() {
        return elements.getLast();
    }

    @Override
    public void push(T e) {
        elements.append(e);
    }

    @Override
    public void pop() {
        elements.removeLast();
    }

    @Override
    public Iterator<T> iterator() {
        return elements.iterator();
    }
}
