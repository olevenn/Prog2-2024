package Uebung1.Ubeung1$1;

public class Stud extends Person {
    private int matrikelnummer;
    private static int nummer = 100;

    public Stud(String name, int jahr) {
        super(name, jahr);
        this.matrikelnummer = nummer;
        nummer++;
    }

    public int getMatrikel(){
        return matrikelnummer;
    }

    @Override
    public String toString() {
        return getMatrikel() + " " + getName();
    }

    @Override
    public boolean equals(Object o) {
        Stud s = (Stud) o;
        return getMatrikel() == s.getMatrikel();
    }
}
