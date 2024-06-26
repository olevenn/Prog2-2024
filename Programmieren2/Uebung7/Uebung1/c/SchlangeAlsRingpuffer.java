package Uebung7.Uebung1.c;

import Uebung7.Uebung3.RingpufferLIFO;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class SchlangeAlsRingpuffer<T> implements Ringpuffer<T>, Iterable<T> {
    private T[] arr;
    private int size;
    private int p;

    @SuppressWarnings("unchecked")
    public SchlangeAlsRingpuffer(int size) {
        this.size = 0;
        p = 0;
        arr = (T[]) new Object[size];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int capacity() {
        return arr.length;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(T e) {
        for (int i = 0; i < capacity(); i++) {
            if (arr[i] == e)
                return true;
        }
        return false;
    }

    @Override
    public void add(T e) {
        if (size() == capacity())
            throw new IllegalStateException("Ringpuffer ist voll");
        arr[(p + size) % capacity()] = e;
        size++;
    }

    @Override
    public T get() {
        return arr[p];
    }

    @Override
    public void remove() {
        arr[p] = null;
        p += 1;
        size--;
    }

    @Override
    public String toString() {
        StringBuilder ausgabe = new StringBuilder();
        for (int i = 0; i < capacity(); i++) {
            ausgabe.append(i).append(" ").append(arr[i]).append("\n");
        }
        return ausgabe.toString();
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator<T> {
        int index;

        @Override
        public boolean hasNext() {
            return index < arr.length;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return arr[index++];
        }

    }
}
