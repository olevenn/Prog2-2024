package Uebung6.Uebung1.DynArray;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class DynArray<T> implements DynArrayI<T>, Iterable<T> {

    static final int startSize = 2;
    private int size;
    private T[] array;

    @SuppressWarnings("unchecked")
    public DynArray() {
        size = 0;
        array = (T[]) new Object[startSize];
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
    public void set(int pos, T e) {
        if (pos < 0 || pos >= size())
            throw new IndexOutOfBoundsException();
        array[pos] = e;
    }

    @Override
    public T get(int pos) {
        if (pos < 0 || pos >= size())
            throw new IndexOutOfBoundsException();
        return array[pos];
    }

    @Override
    public void add(T e) {
        array[size] = e;
        size++;
        if (size == array.length)
            increase();
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
    public void delete(T e) {
        int position = -1;
        for (int i = 0; i < size(); i++) {
            if (array[i] == e)
                position = i;
        }
        for (int i = position; i < size(); i++) {
            array[i] = array[i + 1];
        }
        size--;
        decrease();
    }

    @Override
    public void remove(int pos) {
        if (pos < 0 || pos > size())
            throw new IndexOutOfBoundsException();

        for (int i = pos; i < size(); i++) {
            array[i] = array[i + 1];
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
        return new DynArrayIterator();
    }

    private class DynArrayIterator implements Iterator<T> {
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
}
