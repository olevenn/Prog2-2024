package Uebung10.Uebung1;

import Uebung3.Uebung3.Menge;
import Uebung3.Uebung3.MengeDynArray;
import Uebung8.Folge;
import Uebung8.Uebung1.FolgeAlsDynArray;


import java.util.Arrays;

public class MainTest {
    public static void main(String[] args) {
        //Autoren
        Autor a1 = new Autor("A1");
        Autor a2 = new Autor("A2");
        Autor a3 = new Autor("A3");
        Autor a4 = new Autor("A4");
        Autor a5 = new Autor("A5");
        Autor a6 = new Autor("A6");


        //Bücher
        Buch b1 = new Buch("B1", a1);
        Buch b2 = new Buch("B2", a2);
        Buch b3 = new Buch("B3", a3);
        Buch b4 = new Buch("B4", a4);
        Buch b5 = new Buch("B5", a5);
        Buch b6 = new Buch("B6", a6);

        //Bibliothek
        Bibliothek<Buch> bibliothek = new Bibliothek<>();

        //Bücher in die Bibliothek hinzufügen
        bibliothek.addBook(b3);
        bibliothek.addBook(b1);
        bibliothek.addBook(b4);
        bibliothek.addBook(b2);

        //Test Methode 1
        //MainTest.ausgabe(bibliothek);

        //Test Methode 2
        Menge<Buch> buchMengeDynArray = new MengeDynArray<>(2);
        buchMengeDynArray.insert(b5);
        buchMengeDynArray.insert(b6);

        //MainTest.zusammenFuegen(bibliothek, buchMengeDynArray);
        //MainTest.ausgabe(bibliothek);


        //Test Methode 3
        Folge<Buch> buchFolge = MainTest.sortieren(bibliothek);
        for (Buch tmp : buchFolge) {
            System.out.println(tmp);
        }

    }

    public static void ausgabe(Bibliothek<?> bibliothek) {
        for (Buch tmp : bibliothek) {
            System.out.println(tmp);
        }
    }

    public static void zusammenFuegen(Bibliothek<? super Buch> bibliothek, Menge<Buch> buchMenge) {
        int size = buchMenge.size();
        for (int i = 0; i < size; i++) {
            Buch tmp = buchMenge.get();
            bibliothek.addBook(tmp);
            buchMenge.delete(tmp);
        }
    }

    public static Folge<Buch> sortieren(Bibliothek<? super Buch> b) {
        Folge<Buch> buchFolge = new FolgeAlsDynArray<>(b.menge.size());
        Buch[] arr = new Buch[b.menge.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = b.menge.get();
            b.menge.delete(arr[i]);
        }

        Arrays.sort(arr);

        for (Buch tmp : arr) {
            buchFolge.addLast(tmp);
        }

        return buchFolge;
    }

}