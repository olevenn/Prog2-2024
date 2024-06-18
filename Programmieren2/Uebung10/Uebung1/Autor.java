package Uebung10.Uebung1;

public class Autor implements Comparable<Autor> {
    String name;

    public Autor(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Autor o) {
        return this.name.compareTo(o.name);
    }
}
