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

    @SuppressWarnings("unchecked")
    public void append(T v) {
        ListenElem neu = new ListenElem(v);
        ListenElem tmp = first;

        if(first == null) {
            first = neu;
        } else {
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = neu;
        }
        size++;
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

    public void removeFirst() {
        if (first == null)
            return;
        first = first.next;
        size--;
    }

    public void removeLast() {
        if (first == null)
            return;

        //letzte Element finden
        ListenElem letztesElem = first;

        while (letztesElem.next != null) {
            letztesElem = letztesElem.next;
        }

        //vorletzteElement finden

        ListenElem tmp = first;

        while (tmp.next != letztesElem) {
            tmp = tmp.next;
        }

        tmp.next = null;
        size--;
    }

    @SuppressWarnings("unchecked")
    public void delete(T v) {
        ListenElem vorV;
        ListenElem nachV;

        ListenElem gesucht = new ListenElem(v);

        ListenElem tmp = first;

        while (tmp.value != gesucht.value) {
            tmp = tmp.next;
            if (tmp.next == null)
                return;
        }
        nachV = tmp.next;

        tmp = first;
        while (tmp.next.value != gesucht.value) {
            tmp = tmp.next;
            if (tmp.next == null)
                return;
        }
        vorV = tmp;
        vorV.next = nachV;

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
