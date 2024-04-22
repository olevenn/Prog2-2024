package Uebung3.Uebung4;

import Uebung3.Uebung2.DynArray;

public class Modul {
    private String bezeichnung;
    private Integer ects;

    private DynArray<Stud> dynArray;

    public Modul(String bezeichnung, int ects) {
        this.bezeichnung = bezeichnung;
        this.ects = ects;
        dynArray = new DynArray<>(1);
    }

    public void addStud(Stud s) {
        dynArray.add(s);
    }

    public void removeStud(Stud s) {
        dynArray.delete(s);
    }

    @Override
    public String toString() {
        return "'" + this.bezeichnung + "' mit " + ects;
    }
    
    public void ausgabe() {
        for (int i = 0; i < dynArray.size(); i++) {
            System.out.println(dynArray.get(i));
        }
    }
}
