package Uebung1.Ubeung1$1;

public abstract class Person {
    private String name;
    private int geburtsJahr;


    public Person(String name, int geburtsJahr) {
        this.name = name;
        this.geburtsJahr = geburtsJahr;
    }

    public int getGeburtsJahr() {
        return geburtsJahr;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getName() + " (" + getGeburtsJahr() + ")";
    }

    @Override
    public boolean equals(Object o) {
        Person p = (Person) o;
        return this.getGeburtsJahr() == p.getGeburtsJahr() && this.getName().equals(p.getName());
    }

}
