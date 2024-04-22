package Uebung3.Uebung2;

import java.util.NoSuchElementException;

public class DynArray<T> {
    private Integer size;
    private Integer originalsize;
    private Integer maxGroesse;
    private T[] array;

    @SuppressWarnings("unchecked")
    public DynArray(int originalsize) {
        this.size = 0;
        this.originalsize = originalsize;
        this.maxGroesse = originalsize;
        array = (T[]) new Object[originalsize];
    }

    public void remove(int pos) throws IndexOutOfBoundsException {
        if (pos < 0 || pos >= size)
            throw new IndexOutOfBoundsException();

        try {
            for (int i = pos; i < size; i++) {
                array[i] = array[i + 1];
            }
            size--;
            decrease();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("An dieser Position ist kein Element");
        }
    }

    public void remove() {
        if (array[0] == null)
            throw new IndexOutOfBoundsException("Das Arrays ist leer!");

        for (int i = 0; i < size-1; i++) {
            array[i] = array[i + 1];
        }
        size--;
        decrease();
    }

    public void delete(T e) {
        int pos = -1;
        for (int i = 0; i < size; i++) {
            if (e == array[i])
                pos = i;
        }
        if (pos == -1)
            throw new NoSuchElementException("Dieses Element gibt es nicht");

        for (int i = pos; i < size-1; i++) {
            array[i] = array[i + 1];
        }
        size--;
        decrease();
    }

    public boolean contains(T e) {
        int pos = -1;
        for (int i = 0; i < size; i++) {
            if (e == array[i])
                pos = i;
        }
        return pos != -1;
    }

    @SuppressWarnings("unchecked")
    public void decrease() {
        if (size <= maxGroesse / 4)
            if (size < originalsize)
                ;
            else {
                maxGroesse = maxGroesse / 2;
                T[] neu = (T[]) new Object[maxGroesse];
                for (int i = 0; i < size; i++)
                    neu[i] = array[i];
                array = neu;
            }
    }

    public int size() {
        return size;
    }

    public void set(int pos, T e) throws IndexOutOfBoundsException {
        if (pos < 0 || pos >= size || array[pos] == null)
            throw new IndexOutOfBoundsException();
        array[pos] = e;
    }

    public T get(int pos) throws IndexOutOfBoundsException {
        if (pos < 0 || pos >= size)
            throw new IndexOutOfBoundsException();
        return array[pos];
    }

    public void add(T e) {
        if (size >= array.length)
            increase();
        array[size] = e;
        size++;
    }

    @SuppressWarnings("unchecked")
    private void increase() {
        T[] neu = (T[]) new Object[array.length * 2];
        for (int i = 0; i < size; i++)
            neu[i] = array[i];
        array = neu;
        maxGroesse *= 2;
    }

    public int arraySize() {
        return array.length;
    }
}
