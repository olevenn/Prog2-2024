package Uebung6.Uebung1.DynArray;

import Uebung6.Uebung1.Stapel;

import java.util.Iterator;

public class StapelDynArray<T> implements Stapel<T> {

    DynArray<T> elements;

    public StapelDynArray() {
        elements = new DynArray<>();
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
        return elements.get(size()-1);
    }

    @Override
    public void push(T e) {
        elements.add(e);
    }

    @Override
    public void pop() {
        elements.remove(size()-1);
    }

    public Iterator<T> iterator() {
        return elements.iterator();
    }
}
