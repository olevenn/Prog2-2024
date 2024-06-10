package Uebunug9.Uebung1;

public class Stud implements Comparable<Stud>{
    private static int nextNr = 100;

    private String name;
    private int matNr;

    public Stud(String name) {
        this.name = name;
        matNr = nextNr++;
    }

    public String name(){
        return name;
    }

    public int matNr(){
        return matNr;
    }

    public String toString(){
        return name + "("+matNr+")";
    }


    @Override
    public int compareTo(Stud o) {
        return Integer.compare(matNr(), o.matNr());
    }
}
