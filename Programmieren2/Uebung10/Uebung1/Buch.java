package Uebung10.Uebung1;

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
        return this.titel.compareTo(o.titel);
    }
}
