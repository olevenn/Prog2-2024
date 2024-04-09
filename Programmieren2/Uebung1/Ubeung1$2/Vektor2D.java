package Uebung1.Ubeung1$2;

public class Vektor2D extends Punkt2D implements Addierbar{

    public Vektor2D(double x, double y) {
        setX(x);
        setY(y);
    }

    public Vektor2D(Punkt2D p1, Punkt2D p2) {

    }

    public Vektor2D(Punkt2D p) {
        setY(p.y());
        setX(p.x());
    }

    public Vektor2D() {
        setY(0);
        setX(0);
    }


    @Override
    public Addierbar add(Addierbar a) {
        return null;
    }
}
