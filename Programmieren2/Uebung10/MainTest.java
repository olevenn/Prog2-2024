package Uebung10;

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
        bibliothek.addBook(b1);
        bibliothek.addBook(b2);
        bibliothek.addBook(b3);
        bibliothek.addBook(b4);

        //Test Methode 1
        //MainTest.methode1(bibliothek);

        //Test Methode 2
        Menge<Buch> buchMengeDynArray = new MengeDynArray<>(2);
        buchMengeDynArray.insert(b5);
        buchMengeDynArray.insert(b6);

        //ka wie ich das machen kann Problem: zugriff und lesen und erben mit Generics
        MainTest.methode2(bibliothek, buchMengeDynArray);



        //Test Methode 3
        Folge<Buch> buchFolge = MainTest.methode3(bibliothek);

    }

    public static void methode1(Bibliothek<? extends Buch> bibliothek) {
        for (Buch tmp : bibliothek) {
            System.out.println(tmp);
        }
    }

    public static void methode2(Bibliothek<Buch> bibliothek, Menge<Buch> buchMenge) {
        int size = buchMenge.size(); //ansonsten funktioniert die for schleife nicht
        for (int i = 0; i < size; i++) {
            Buch tmp = buchMenge.get();
            bibliothek.addBook(tmp);
            buchMenge.delete(tmp);
        }
    }

    public static Folge<Buch> methode3(Bibliothek<Buch> b) {
        //sehr fragwürdig, ob diese Methode klappt

        Folge<Buch> buchFolge = new FolgeAlsDynArray<>(b.menge.size());
        MengeDynArray<Buch> mengeDynArray = new MengeDynArray<>(b.menge.size());

        for (Buch tmp :
                b) {
            b.menge.delete(tmp);
            mengeDynArray.insert(tmp);
        }
        Buch[] tmp = BuchUtil.sort(mengeDynArray);

        for (Buch tmp1 :
                tmp) {
            buchFolge.addLast(tmp1);
        }
        return buchFolge;
    }

}
