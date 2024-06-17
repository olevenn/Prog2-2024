package Uebung9.Uebung4;

import Uebung1.Ubeung1.Person;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if(o1.getName().equals(o2.getName()))
            return Integer.compare(o1.getGeburtsJahr(), o2.getGeburtsJahr());
        return -1;
    }
}
