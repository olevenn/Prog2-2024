package Uebung1.Ubeung1$2;

public class Quadrat extends GeoObject2D{

    private double radius;
    private double kantenLaenge;

    public Quadrat(double radius, double kantenLaenge) {
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

    public Punkt2D eckeLU() {
        return null;
    }

    public Punkt2D eckeRO() {
        return null;
    }

    public double kanatenI(){
        return 0.0;
    }
}