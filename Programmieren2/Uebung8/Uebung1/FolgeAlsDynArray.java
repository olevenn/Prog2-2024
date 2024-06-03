package Uebung8.Uebung1;

import Uebung8.Folge;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class FolgeAlsDynArray<T> implements Folge<T> {

    private int size;
    private T[] array;

    @SuppressWarnings("unchecked")
    public FolgeAlsDynArray(int size) {
        this.size = 0;
        array = (T[]) new Object[size];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(T e) {
        for (int i = 0; i < size(); i++) {
            if (array[i] == e)
                return true;
        }
        return false;
    }

    @Override
    public T get(int pos) throws IndexOutOfBoundsException {
        if (pos < 0 || pos >= size())
            throw new IndexOutOfBoundsException();
        return array[pos];
    }

    @Override
    public void set(int pos, T e) throws IndexOutOfBoundsException {
        if (pos < 0 || pos >= size())
            throw new IndexOutOfBoundsException();
        array[pos] = e;
    }

    @Override
    public int pos(T e) throws NoSuchElementException {
        int tmp = -1;
        if (!contains(e))
            throw new NoSuchElementException();
        for (int i = 0; i < size(); i++) {
            if (array[i] == e)
                tmp = i;
        }
        return tmp;
    }

    @Override
    public void insert(int pos, T e) throws IndexOutOfBoundsException {
        if(pos < 0 || pos > size())
            throw new IndexOutOfBoundsException();

        if(size == array.length-1)
            increase();

        for (int i = size(); i >= pos; i--) {
            array[i + 1] = array[i];
        }
        array[pos] = e;
        size++;
    }

    @Override
    public void addFirst(T e) {
        if(size == array.length-1)
            increase();
        for (int i = size(); i >= 0; i--) {
            array[i + 1] = array[i];
        }
        array[0] = e;
        size++;
    }

    @Override
    public void addLast(T e) {
        if(size == array.length-1)
            increase();
        array[size] = e;
        size++;

    }

    @Override
    public void remove(int pos) throws IndexOutOfBoundsException {
        if(pos < 0 || pos > size())
            throw new IndexOutOfBoundsException();

        for (int i = pos; i < size(); i++) {
            array[i] = array[i + 1];
        }
        size--;
        decrease();
    }

    @Override
    public void delete(T e) {
        int position = -1;
        for (int i = 0; i < size(); i++) {
            if(array[i]== e)
                position = i;
        }
        for (int i = position; i < size(); i++) {
            array[i] = array[i+1];
        }
        size--;
        decrease();
    }

    @SuppressWarnings("unchecked")
    private void decrease() {
        if (size <= array.length / 4) {
            T[] neu = (T[]) new Object[array.length / 2];
            for (int i = 0; i < size; i++)
                neu[i] = array[i];
            array = neu;
        }
    }

    @SuppressWarnings("unchecked")
    private void increase() {
        T[] neu = (T[]) new Object[array.length * 2];
        for (int i = 0; i < size; i++)
            neu[i] = array[i];
        array = neu;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator<T> {
        int index;

        @Override
        public boolean hasNext() {
            return index < array.length;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return array[index++];
        }
    }

    @Override
    public String toString() {
        StringBuilder ausgabe= new StringBuilder();
        for (T t : array) {
            ausgabe.append(t).append(" ");
        }
        return ausgabe.toString();
    }
}
