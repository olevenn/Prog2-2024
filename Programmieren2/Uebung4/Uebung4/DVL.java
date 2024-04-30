package Uebung4.Uebung4;

import Uebung4.Uebung2.EVL;

public class DVL<T> extends EVL<T> {

    ListenElem first;
    private int size;

    class ListenElem {
        T value;
        ListenElem next;
        ListenElem prev;

        ListenElem(T v) {
            value = v;
            next = null;
            prev = null;
        }
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
    public T getFirst() {
        return first.value;
    }

    @Override
    public T getLast() {
        ListenElem tmp = first;
        while (tmp.next != null)
            tmp = tmp.next;

        return tmp.value;
    }

    @Override
    public void insert(T v) {
        ListenElem neu = new ListenElem(v);
        if (first == null) {
            first = neu;
        } else {
            neu.next = first;
            first.prev = neu;
            first = neu;
        }
        size++;
    }

    @Override
    public void append(T v) {
        ListenElem neu = new ListenElem(v);
        ListenElem tmp = first;

        //wenn die Liste leer ist
        if (first == null) {
            first = neu;
        } else {
            while (tmp.next != null)
                tmp = tmp.next;
            tmp.next = neu;
            neu.prev = tmp;
        }
        size++;
    }

    @Override
    public void removeFirst() {
        first.next.prev = null;
        first = first.next;
        size--;
    }

    @Override
    public void removeLast() {
        ListenElem tmp = first;
        while (tmp.next != null)
            tmp = tmp.next;
        tmp.prev.next = null;
        size--;
    }

    public boolean contains(T v) {
        ListenElem tmp = first;
        ListenElem gesucht = new ListenElem(v);

        while (tmp.value != gesucht.value) {
            tmp = tmp.next;
            if (tmp.next == null && tmp.value != gesucht.value)
                return false;
        }
        return true;
    }

    public void delete(T v) {
        try {
            ListenElem zuLoeschen = new ListenElem(v);
            ListenElem vorV = null;
            ListenElem nachV = null;
            ListenElem tmp = first;

            if(!contains(v))
                return;

            if(first.value == zuLoeschen.value) {
                first.next.prev = null;
                first = first.next;
            }
            size--;
            while(tmp.value != zuLoeschen.value)
                tmp = tmp.next;

            vorV = tmp.prev;
            nachV = tmp.next;

            vorV.next = nachV;
            nachV.prev = vorV;


        } catch (NullPointerException e) {

        }
    }


    @Override
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
