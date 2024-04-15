package Uebung1.Ubeung1;

public class Boxer extends Person {

    private double gewicht;

    public Boxer(String name, int jahr, double gewicht) {
        super(name, jahr);
        this.gewicht = gewicht;
    }

    public double gewicht() {
        return gewicht;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    @Override
    public String toString() {
        return this.getName() + " " + getGeburtsJahr() + " " + gewicht();
    }

    @Override
    public boolean equals(Object o) {
        Person b = (Person) o;
        return this.getGeburtsJahr() == b.getGeburtsJahr() && this.getName().equals(b.getName());
    }
}
