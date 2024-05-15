package Uebung6.Uebung1;

import java.util.NoSuchElementException;

public class StapelArray <T> {
    T [] arr;
    private int size;
    private int arrsize;

    @SuppressWarnings("unchecked")
    public StapelArray(int size) {
        arr = (T[]) new Object[size];
        this.size = 0;
        this.arrsize = size;
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
        if(size == arrsize)
            increase();
    }

    public void pop(){
        size--;
        if(size < arrsize/3)
            decrease();
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int maxsize() {
        return arrsize;
    }

    @SuppressWarnings("unchecked")
    private void increase() {
        T [] tmp = (T[]) new Object[arrsize*2];
        arrsize *= 2;
        for (int i = 0; i < size; i++) {
            tmp[i] = arr[i];
        }
        this.arr = tmp;
    }

    @SuppressWarnings("unchecked")
    private void decrease() {
        T [] tmp = (T []) new Object[arrsize/2];
        arrsize /= 2;
        for (int i = 0; i < size; i++) {
            tmp[i] = arr[i];
        }
        this.arr = tmp;
    }

}
