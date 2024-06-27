package Uebung11.Uebung1;

import Uebung7.Uebung1.a.SchlangeAlsArray;

import java.util.Iterator;

public class BinBaum <T> implements Iterable<T>{
    protected Knoten root;

    protected class Knoten {
        protected T val;
        protected Knoten ltb;
        protected Knoten rtb;

        public Knoten(T v) {
            val = v;
            ltb = null;
            rtb = null;
        }
    }

    public BinBaum(Knoten l, T v, Knoten r) {
        root = new Knoten(v);
        root.ltb = l;
        root.rtb = r;
    }

    public BinBaum(T v) {
        this(null, v, null);
    }

    public BinBaum() {
        root = null;
    }

    @Override
    public Iterator<T> iterator() {
        return new bfsIterator();
    }

    class bfsIterator implements Iterator<T> {
        SchlangeAlsArray<Knoten> s = new SchlangeAlsArray<>(100);

        public bfsIterator() {
            if(root != null)
                s.enqueue(root);
        }

        @Override
        public boolean hasNext() {
            return s.getSize() != 0;
        }

        @Override
        public T next() {
            Knoten k = s.front();
            if(k.ltb != null)
                s.enqueue(k.ltb);
            if (k.rtb != null)
                s.enqueue(k.rtb);
            s.dequeue();
            return k.val;
        }
    }
}
