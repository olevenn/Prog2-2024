package Uebung1.Ubeung2;

public class Punkt2D {

    private double x;
    private double y;

    public double x() {
        return x;
    }
    public double y() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double abstand(Punkt2D p) {
        return Math.sqrt(Math.pow((p.x - this.x), 2.0) + Math.pow(p.y - this.y, 2.0));
    }
}
