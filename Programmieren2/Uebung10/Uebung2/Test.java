package Uebung10.Uebung2;

import Uebung1.Ubeung1.Boxer;
import Uebung1.Ubeung1.Stud;
import Uebung6.Uebung2.Paar;
import Uebung8.Folge;
import Uebung8.Uebung1.FolgeAlsDynArray;

public class Test {

    public static <E, Z> Folge<Paar<E, Z>> erzeugePaare(Folge<E> f1, Folge<Z> f2) {
        Folge<Paar<E, Z>> folge = new FolgeAlsDynArray<>(2);
        int size = f1.size();
        for (int i = 0; i < size; i++) {
            folge.addLast(new Paar<>(f1.get(i), f2.get(i)));
        }
        return folge;

    }

    public static void main(String[] args) {
        Folge<Stud> f1 = new FolgeAlsDynArray<>(2);
        f1.addLast(new Stud("A", 1));
        f1.addLast(new Stud("B", 2));
        f1.addLast(new Stud("C", 3));


        Folge<Boxer> f2 = new FolgeAlsDynArray<>(2);
        f2.addLast(new Boxer("a", 11, 11.1));
        f2.addLast(new Boxer("b", 22, 22.2));
        f2.addLast(new Boxer("c", 33, 33.3));


        Folge<Paar<Stud, Boxer>> folge = erzeugePaare(f1, f2);
        System.out.println(folge);
    }
}
