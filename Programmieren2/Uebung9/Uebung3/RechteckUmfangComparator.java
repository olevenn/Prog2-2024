package Uebung9.Uebung3;

import java.util.Comparator;

public class RechteckUmfangComparator implements Comparator<Rechteck> {
    @Override
    public int compare(Rechteck o1, Rechteck o2) {
        return Float.compare(o1.umfang(), o2.umfang());
    }
}
