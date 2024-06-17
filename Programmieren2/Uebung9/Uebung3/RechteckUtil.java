package Uebung9.Uebung3;

import Uebung8.Folge;
import Uebung8.Uebung1.FolgeAlsDynArray;

import java.util.Arrays;
import java.util.Comparator;

public class RechteckUtil {
    public static Rechteck sort(Folge<Rechteck> folge, Comparator<Rechteck> comparator) {
        Rechteck []tmp = new Rechteck[folge.size()];
        for (int i = 0; i < folge.size(); i++) {
            tmp[i] = folge.get(i);
        }
        Arrays.sort(tmp, comparator);
        return tmp[0];
    }

    public static void main(String[] args) {
        FolgeAlsDynArray<Rechteck> fada = new FolgeAlsDynArray<>(2);

        Rechteck r1 = new Rechteck(3,15);
        Rechteck r2 = new Rechteck(6,10);

        fada.addLast(r1);
        fada.addLast(r2);

        Comparator<Rechteck> c1 = new RechteckFloaecheComparator();
        Comparator<Rechteck> c2 = new RechteckUmfangComparator();

        System.out.println(RechteckUtil.sort(fada, c1));
        System.out.println(RechteckUtil.sort(fada, c2));

    }

}
