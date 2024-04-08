package Uebung1.Ubeung1$2;

public class Kreis extends GeoObject2D{

    private double radius;
    private double kantenLaenge;

    public Kreis(double radius, double kantenLaenge) {
        this.radius = Math.abs(radius);
        this.kantenLaenge = Math.abs(kantenLaenge);
    }

    @Override
    public double umfang() {
        return 0;
    }

    @Override
    public double flaeche() {
        return 0;
    }

    @Override
    public Punkt2D position() {
        return null;
    }

    @Override
    public void moveTo(Punkt2D p) {

    }

    public Punkt2D mittelpunkt() {
        return null;
    }

    public double radius() {
        return 0.0;
    }
}
