package Uebung6.Uebung1;

import java.util.NoSuchElementException;

public class StapelArray <T> {
    T [] arr;
    private int size;

    @SuppressWarnings("unchecked")
    public StapelArray(int size) {
        arr = (T[]) new Object[size];
        this.size = 0;
    }

    public T top() {
        if((size-1)< 0)
            throw new NoSuchElementException();
        return arr[size-1];
    }

    public void push(T e){
        //increase check

        arr[size] = e;
        size++;
    }

    public void pop(){
        //decrease check
        size--;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
