package Uebung9.Uebung3;

public class Rechteck {
    float laenge;
    float breite;

    public Rechteck(float laenge, float breite) {
        this.laenge = laenge;
        this.breite = breite;
    }

    public float umfang() {
        return (laenge * laenge) + (breite * breite);
    }

    public float flaeche() {
        return laenge * breite;
    }

    public String toString() {
        return "Laenge: " + laenge + " " + "Breite: " + breite;
    }
}
