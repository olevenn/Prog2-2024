package Uebung9.Uebung3;

import java.util.Comparator;

public class RechteckFloaecheComparator implements Comparator<Rechteck> {
    @Override
    public int compare(Rechteck o1, Rechteck o2) {
        return Float.compare(o1.flaeche(), o2.flaeche());
    }
}
