package Uebung10;

import Uebung2.Uebung3.Menge;

public class Bibliothek <T>{
    Menge<T> menge;

    public Bibliothek() {
        menge = null;
    }

    public void addBook(T buch) {
        menge.insert(buch);
    }
}
