package Uebung11.Uebung1;

import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        BinBaum<Integer> baum = new BinBaum<>();
        BinBaum<Integer>.Knoten linkerKnoten = baum.new Knoten(2);
        BinBaum<Integer>.Knoten rechterKnoten = baum.new Knoten(3);

        BinBaum<Integer> meinbaum = new BinBaum<>(linkerKnoten, 1, rechterKnoten);

        for (Integer k: meinbaum) {
            System.out.println(k);
        }
    }
}

