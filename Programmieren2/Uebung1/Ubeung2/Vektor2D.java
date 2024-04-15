package Uebung1.Ubeung2;

public class Vektor2D extends Punkt2D implements Addierbar, Messbar{

    public Vektor2D(double x, double y) {
        setX(x);
        setY(y);
    }

    public Vektor2D(Punkt2D p1, Punkt2D p2) {
        this.setX(p2.x() - p1.x());
        this.setY(p2.y() - p1.y());
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
        Vektor2D v = (Vektor2D) a;
        Vektor2D tmp = new Vektor2D();
        tmp.setX(this.x() + v.x());
        tmp.setY(this.y() + v.y());
        return tmp;
    }

    @Override
    public double laenge() {
        return Math.sqrt((x() * x()) + (y() * y()));
    }
}
