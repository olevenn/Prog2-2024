package Uebung7.Uebung1.b;

import java.util.NoSuchElementException;

public class SchlangeAlsEVL <T>{

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

    public void enqueue(T e) {
        ListenElem neu = new ListenElem(e);
        ListenElem tmp = first;

        if(first == null)
            first = neu;
        else {
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = neu;
        }
        size++;
    }

    public void dequeue() {
        if (first == null)
            return;
        first = first.next;
        size--;
    }

    public T front() throws NoSuchElementException {
        if (first == null)
            throw new NoSuchElementException("Liste leer");
        return first.value;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();

        ListenElem tmp = first;
        while(tmp != null) {
            s.append(tmp.value).append(" ");
            tmp = tmp.next;
        }
        return s.toString();
    }

}
