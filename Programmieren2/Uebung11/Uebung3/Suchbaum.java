package Uebung11.Uebung3;

import java.util.Iterator;

public class Suchbaum<T extends Comparable<T>> implements Menge<T>{

    private int size;
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

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return root == null;
    }

    @Override
    public T get() {
        return null;
    }

    @Override
    public void insert(T e) {
        if(root == null)
            root = new Knoten(e);
        Knoten tmp = root;
        while(tmp != null) {
            if(e.compareTo(tmp.val) > 0) {
                tmp = tmp.rtb;
            } else {
                tmp = tmp.ltb;
            }
        }




        size++;
    }

    @Override
    public void delete(T e) {

    }

    @Override
    public boolean contains(T e) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
