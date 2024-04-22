package Uebung3.Uebung4;

import Uebung3.Uebung2.DynArray;

public class Stud {
    private String name;
    private int matrikelnummer;
    private static int nummer = 100;
    DynArray<Modul> dynArray;

    public Stud(String name, int jahr) {
        this.name = name;
        this.matrikelnummer = nummer;
        nummer++;
        dynArray = new DynArray<>(1);
    }

    public int getMatrikel(){
        return matrikelnummer;
    }

    public void anmelden(Modul m) {
        dynArray.add(m);
    }

    public void abmelden(Modul m) {
        dynArray.delete(m);
    }

    public void belegt() {
        for (int i = 0; i < dynArray.size(); i++) {
            System.out.println(dynArray.get(i));
        }
    }

    @Override
    public String toString() {
        return getMatrikel() + " " + name;
    }

    @Override
    public boolean equals(Object o) {
        Uebung1.Ubeung1.Stud s = (Uebung1.Ubeung1.Stud) o;
        return getMatrikel() == s.getMatrikel();
    }
}
