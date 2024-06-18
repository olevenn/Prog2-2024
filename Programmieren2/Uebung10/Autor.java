package Uebung10;

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
        if(this.name.equals(o.name))
            return 0;
        return -1;
    }
}
