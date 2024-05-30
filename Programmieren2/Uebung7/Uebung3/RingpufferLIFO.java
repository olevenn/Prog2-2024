package Uebung7.Uebung3;

import Uebung7.Uebung1.c.Ringpuffer;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class RingpufferLIFO <T> implements Ringpuffer<T>, Iterable<T>{

    private T[] arr;
    private int size;
    private int p;

    @SuppressWarnings("unchecked")
    public RingpufferLIFO(int size) {
        if(size < 0)
            throw new IllegalArgumentException();

        this.size = 0;
        p = 0;
        arr = (T[]) new Object[size];
    }

    @Override
    public int size() {
        if(size > capacity()) //dumm aber muss sein wegen meinem Code für die Ringpuffer size ausgabe
            return capacity();
        return size;
    }

    @Override
    public int capacity() {
        return arr.length;
    }

    @Override
    public boolean isEmpty() {
        return 0==size;
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
        arr[(p + size) % capacity()] = e;
        size += 1;
    }

    @Override
    public T get() {
        if(size()== 0)
            throw new NoSuchElementException();
        return arr[(p+size-1)%capacity()];
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
        int gechecked = 0;
        int index = p % capacity();
        @Override
        public boolean hasNext() {
            return gechecked < arr.length;
        }
        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            gechecked++;
            T tmp = arr[index];
            index = (((index - 1)%capacity()) + capacity())% capacity(); //positives Modulo damit aus -1%3=2 und nicht -1 rauskommt
            return tmp;
        }
    }
}