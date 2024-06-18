package Uebung10;

public class Buch implements Comparable<Buch>{
    String titel;
    Autor autor;

    public Buch(String titel, Autor autor) {
        this.titel = titel;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return titel + " " + autor;
    }

    @Override
    public int compareTo(Buch o) {
        if(this.titel.equals(o.titel)) {
            return this.autor.compareTo(o.autor);
        }
        return -1;
    }
}
