package Uebung2.Uebung2;

import Uebung1.Ubeung1.Person;
import Uebung2.Uebung1.Paar;

public class TestKind {
    public static void main(String[] args) {

        //Kinder
        Kind bart = new Kind<>("Bart", 2000);
        Kind lisa = new Kind<>("Lisa", 2001);

        //Eltern
        Kind homer = new Kind<>("Homer", 1970);
        Kind marge = new Kind<>("Marge", 1972);

        //Zuweisung
        bart.setEltern(homer, marge);
        lisa.setEltern(homer, marge);

        //Test
        System.out.println(Kind.geschwister(bart, lisa));

        //Homer Eltern setup
        Kind abe = new Kind<>("Abe", 1950);
        Kind mona = new Kind<>("Mona", 1951);

        homer.setEltern(abe, mona);

        //Marge Eltern setup
        Kind clancy = new Kind<>("Clancy", 1952);
        Kind jackie = new Kind<>("Jackie", 1953);

        marge.setEltern(clancy, jackie);

        //Test
        System.out.println(Kind.geschwister(marge, homer));


        //family Test
        Paar p1 = TestKind.family(bart);
        System.out.println(TestKind.dAlter(p1));

    }

    public static Paar family(Kind k) {
        Paar tmp = new Paar<>(k, k.getEltern());
        return tmp;
    }

    public static int dAlter(Paar fam) {
        int durchschnittlichesAlter = 0;

        Kind k1 = (Kind) fam.getErstes();
        Paar p1 = (Paar) fam.getZweites();

        Kind k2 = (Kind) p1.getErstes();
        Kind k3 = (Kind) p1.getZweites();


        int k1Geb = k1.getGeburtsJahr();
        int k2Geb = k2.getGeburtsJahr();
        int k3Geb = k3.getGeburtsJahr();


        durchschnittlichesAlter = ((k1Geb - k2Geb) + (k1Geb - k3Geb)) / 2;
        return durchschnittlichesAlter;
    }


}
