package Uebung2.Uebung1;

public class Paar <E, Z>{

    E erstes;
    Z zweites;

    public Paar(E erstes, Z zweites) {
        this.erstes = erstes;
        this.zweites = zweites;
    }

    public E getErstes() {
        return erstes;
    }

    public Z getZweites() {
        return zweites;
    }

    public void setErstes(E erstes) {
        this.erstes = erstes;
    }

    public void setZweites(Z zweites) {
        this.zweites = zweites;
    }

    @Override
    public String toString() {
        return "SCHEI? BESCHREIBUNG DER AUFGABE";
    }
    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Paar<?,?>))
            return false;
        Paar<E, Z> p = (Paar<E, Z>) o;

        return this.getErstes() == ((Paar<?, ?>) o).getErstes() && this.getZweites() == ((Paar<?, ?>) o).getZweites();
    }
}
