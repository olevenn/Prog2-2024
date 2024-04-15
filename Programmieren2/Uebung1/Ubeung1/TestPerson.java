package Uebung1.Ubeung1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class TestPerson {

    static Stud sa = new Stud("Anna", 1999);
    static Stud sb = new Stud("Ben", 2002);
    static Boxer bb = new Boxer("Ben", 2002, 88.5);
    static Stud sa2 = new Stud("Anna", 1999);
    static Boxer bb2 = new Boxer("Ben", 2002, 100.1);

    static Person pa;
    static Person psb;
    static Person pbb;
    static Person pa2;
    static Person pb2;
    static Person pnull;

    @BeforeEach
    void init() {
        pa = (Person) sa;
        psb = (Person) sb;
        pbb = (Person) bb;
        pa2 = (Person) sa2;
        pb2 = (Person) bb2;
    }

    @Test
    void testMatNummern() {
        assertEquals(100, sa.getMatrikel());
        assertEquals(101, sb.getMatrikel());
        assertEquals(102, sa2.getMatrikel());
    }

    @Test
    void testGewicht() {
        assertEquals(88.5, bb.gewicht(), 0.0001);
        bb.setGewicht(98.5);
        assertEquals(98.5, bb.gewicht(), 0.0001);
    }

    @Test
    void testClassCastException() {
        assertThrows(ClassCastException.class, () -> bb = (Boxer) pa);
    }

}
