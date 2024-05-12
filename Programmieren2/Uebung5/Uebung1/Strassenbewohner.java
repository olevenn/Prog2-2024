package Uebung5.Uebung1;

public class Strassenbewohner {
    private int hausNr;
    private String name;

    public Strassenbewohner(int hausNr, String name) {
        this.hausNr = hausNr;
        this.name = name;
    }

    public int getHausNr() {
        return this.hausNr;
    }


    @Override
    public String toString() {
        if(this == null)
            return "";
        return hausNr + " " + name;
    }
}
