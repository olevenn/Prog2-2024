package Uebung10;

import Uebung2.Uebung3.Menge;
import Uebung3.Uebung3.MengeDynArray;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Bibliothek <T> implements Iterable<T>{
    MengeDynArray<T> menge;

    public Bibliothek() {
        menge = new MengeDynArray<>(2);
    }

    public void addBook(T buch) {
        menge.insert(buch);
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator<T> {


        @Override
        public boolean hasNext() {
            return !menge.isEmpty();
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T tmp = menge.get();
            menge.delete(tmp);
            return tmp;
        }
    }
}
