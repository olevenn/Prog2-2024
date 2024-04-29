package Uebung4.Uebung3;

import Uebung3.Uebung3.Menge;

public class MengeEVL<T> implements Menge<T> {


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

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public T get() {
        return first.value;
    }

    @Override
    public void insert(T v) {
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

    @Override
    public void delete(T v) {
        ListenElem vorV = null;
        ListenElem nachV = null;

        ListenElem gesucht = new ListenElem(v);

        ListenElem tmp = first;

        if(tmp.value == gesucht.value) {
            first = tmp.next;
            size--;
        }

        while (tmp.value != gesucht.value) {
            tmp = tmp.next;
            if (tmp.next == null)
                break;
        }
        if(tmp.next == null)
            ;
        else
            nachV = tmp.next;

        tmp = first;
        if(tmp.next.value == null) {

        }

        while (tmp.next.value != gesucht.value) {
            tmp = tmp.next;
            if (tmp.next == null)
                return;
        }
        vorV = tmp;
        vorV.next = nachV;

        size--;
    }

    @Override
    public boolean contains(T v) {
        ListenElem neu = new ListenElem(v);

        ListenElem tmp = first;

        while (tmp.value != neu.value) {
            if (tmp.next == null)
                return false;
            tmp = tmp.next;
        }
        return true;
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
