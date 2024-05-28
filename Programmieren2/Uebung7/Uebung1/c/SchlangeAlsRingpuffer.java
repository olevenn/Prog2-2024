package Uebung7.Uebung1.c;

public class SchlangeAlsRingpuffer <T> {
    private T [] arr;
    private int size;
    private int p;

    @SuppressWarnings("unchecked")
    public SchlangeAlsRingpuffer(int size) {
        this.size = 0;
        p = 0;
        arr = (T[]) new Object[size];
    }

    public int size() {
        return size;
    }

    public int capacity(){
        return arr.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(T e) {
        if(size() == capacity())
            throw new IllegalStateException("Ringpuffer ist voll");
        arr[p+size] = e;
        size++;
    }

    public T get() {
        return arr[p];
    }

    public void remove(){
        arr[p] = null;
        p += 1;
        size--;
    }
}
