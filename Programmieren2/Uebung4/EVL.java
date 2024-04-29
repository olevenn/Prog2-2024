package Uebung4;

import java.lang.annotation.ElementType;
import java.util.*;

public class EVL<T> {

    ListenElem first;
    private int size;

    class ListenElem {
        T value;
        ListenElem next;

        ListenElem(T v) {
            value = v;
            next = null;
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void append(T v) {
        ListenElem tmp = first;

        while (tmp.next != null) {
            tmp = tmp.next;
        }

        tmp.next = (ListenElem) v;
    }

    public void insert(T v) {
        ListenElem neu = new ListenElem(v);
        neu.next = first;
        first = neu;
        size++;
    }

    public T getFirst() throws NoSuchElementException {
        if (first == null)
            throw new NoSuchElementException("Liste leer");
        return first.value;
    }

    public T getLast() throws NoSuchElementException {
        if (first == null)
            throw new NoSuchElementException("Liste leer");

        ListenElem tmp = first;

        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.value;
    }

    public void remove() {
        if (first == null)
            return;
        first = first.next;
        size--;
    }

    public String toString() {
        String s = "";

        ListenElem tmp = first;
        while (tmp != null) {
            s += tmp.value + " ";
            tmp = tmp.next;
        }
        return s;
    }


}
