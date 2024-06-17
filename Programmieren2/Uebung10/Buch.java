package Uebung10;

public class Buch {
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
}
