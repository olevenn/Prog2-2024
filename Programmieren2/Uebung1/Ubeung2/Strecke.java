package Uebung1.Ubeung2;

public class Strecke extends GeoObjekt implements Messbar{
    @Override
    public Punkt2D position() {
        return new Punkt2D();
    }

    @Override
    public void moveTo(Punkt2D p) {

    }

    public Punkt2D anfP() {
        return new Punkt2D();
    }

    public Punkt2D endP() {
        return new Punkt2D();
    }

    @Override
    public double laenge() {
        return 0;
    }
}
