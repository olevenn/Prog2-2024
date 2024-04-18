package Uebung2.Uebung2;

import Uebung1.Ubeung1.Person;
import Uebung2.Uebung1.Paar;

public class Kind<V, M> extends Person {


    private Paar<Person, Person> eltern;

    public Kind(String name, int geburtsJahr) {
        super(name, geburtsJahr);
    }

    public void setEltern(Person v, Person m) {
        this.eltern = new Paar<>(v, m);
    }

    public Paar getEltern() {
        return new Paar<>(eltern.getErstes(), eltern.getZweites());
    }

    static boolean geschwister(Kind<Person, Person> a, Kind<Person, Person> b) {
        return a.eltern.getErstes().toString().equals(b.eltern.getErstes().toString()) &&
                a.eltern.getZweites().toString().equals(b.eltern.getZweites().toString());
    }
}
