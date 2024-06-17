package Uebung10;

import Uebung2.Uebung3.Menge;

public class MainTest {
    public static void main(String[] args) {

    }

    public static void methode1(Bibliothek<? extends Buch> bibliothek) {
        for (Buch tmp : bibliothek) {
            System.out.println(tmp);
        }
    }

    public static void methode2(Bibliothek<? super Buch> bibliothek, Menge<Buch> buchMenge) {
        for (int i = 0; i < buchMenge.size(); i++) {
            Buch tmp = buchMenge.get();
            buchMenge.delete(tmp);
            bibliothek.addBook(tmp);
        }
    }


}
