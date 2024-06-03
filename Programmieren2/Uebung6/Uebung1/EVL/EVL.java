package Uebung6.Uebung1.EVL;


import java.util.Iterator;

public class EVL<T> implements EVLI<T>, Iterable<T>{

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
    public T get() {
        return first.value;
    }

    @Override
    public void insert(T e) {
        ListenElem neu = new ListenElem(e);
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
    public void remove() {

    }

    public void removeLast() {
        ListenElem tmp = first;
        while (tmp.next != null)
            tmp = tmp.next;
        tmp.prev.next = null;
        size--;
    }

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

    public T getLast() {
        ListenElem tmp = first;
        while (tmp.next != null)
            tmp = tmp.next;

        return tmp.value;
    }

    public Iterator<T> iterator() {
        return new Iterator<>() {	// Innere Klasse: Anonyme Klasse

            /* Instanzvariablen */

            ListenElem cursor = first;

            /* Instanzmethoden */

            @Override
            public boolean hasNext() {
                return cursor != null;
            }

            @Override
            public T next() {
                T value = cursor.value;
                cursor = cursor.next;
                return value;
            }
        };
    }
}
