package Uebung11.Uebung1;

import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        BinBaum<Integer> baum = new BinBaum<>();
        BinBaum.Knoten k6 = baum.knoten(6);
        BinBaum.Knoten k5 = baum.knoten(5);
        BinBaum.Knoten k4 = baum.knoten(4);
        BinBaum.Knoten k1 = baum.knoten(k6, 1, k5);
        BinBaum.Knoten k8 = baum.knoten(8);

        BinBaum.Knoten k3 = baum.knoten(k4, 3, k1);
        BinBaum.Knoten k7 = baum.knoten(k8, 7, null);

        baum = new BinBaum<>(k3, 2, k7);
        System.out.println("Binärbaum: " + baum);

        for (Integer k: baum) {
            System.out.println(k);
        }
    }
}

