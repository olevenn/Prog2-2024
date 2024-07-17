package Uebung11.Uebung1;

import Uebung7.Uebung1.a.SchlangeAlsArray;

import java.util.Iterator;

public class BinBaum<T> implements Iterable<T> {
    protected Knoten root;

    public class Knoten {
        protected T value;
        protected Knoten left;
        protected Knoten right;

        public Knoten(T v) {
            this(null, v, null);
        }

        public Knoten(Knoten left, T value, Knoten right) {
            this.left = left;
            this.value = value;
            this.right = right;
        }

        public String toString() {
            return "" + value;
        }
    }

    public Knoten knoten(T value) {
        return knoten(null, value, null);
    }

    public Knoten knoten(Knoten left, T value, Knoten right) {
        return new Knoten(left, value, right);
    }

    public BinBaum(Knoten l, T v, Knoten r) {
        root = new Knoten(v);
        root.left = l;
        root.right = r;
    }

    public BinBaum(T v) {
        this(null, v, null);
    }

    public BinBaum() {
        root = null;
    }

    public int size() {
        return size(root);
    }

    private int size(Knoten k) {
        if (k == null) return 0;
        return 1 + size(k.left) + size(k.right);
    }

    public int hoehe() {
        return hoehe(root);
    }

    private int hoehe(Knoten k) {
        if (k == null) return 0;
        return 1 + Math.max(hoehe(k.left), hoehe(k.right));
    }


    @Override
    public Iterator<T> iterator() {
        return new bfsIterator();
    }

    class bfsIterator implements Iterator<T> {
        SchlangeAlsArray<Knoten> s = new SchlangeAlsArray<>(100);

        public bfsIterator() {
            if (root != null)
                s.enqueue(root);
        }

        @Override
        public boolean hasNext() {
            return s.getSize() != 0;
        }

        @Override
        public T next() {
            Knoten k = s.front();
            if (k.left != null)
                s.enqueue(k.left);
            if (k.right != null)
                s.enqueue(k.right);
            s.dequeue();
            return k.value;
        }
    }
}
