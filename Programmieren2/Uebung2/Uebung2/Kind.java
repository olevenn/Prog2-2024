package Uebung2.Uebung2;

import Uebung2.Uebung1.Paar;

public class Kind<V, M> extends Person{


    private Paar<Person, Person> eltern;

    public void setEltern(Person v, Person m) {
        this.eltern = new Paar<>(v, m);
    }

    static boolean geschwister(Kind<Person, Person> a, Kind<Person, Person> b) {
        return a.eltern == b.eltern;
    }


}
