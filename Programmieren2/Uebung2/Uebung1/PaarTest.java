package Uebung2.Uebung1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaarTest {

    static Paar<String, Integer> p1;
    static Paar<String, Integer> p2;

    @BeforeEach
    void init() {
        p1 = new Paar<>("Tim", 2);
        p2 = new Paar<>("Tim", 2);
    }


    @Test
    void getErstes() {
        assertEquals("Tim", p1.getErstes());
    }

    @Test
    void getZweites() {
        assertEquals(2, p1.getZweites());
    }

    @Test
    void setErstes() {
        p1.setErstes("Oliver");
        assertEquals("Oliver", p1.getErstes());
    }

    @Test
    void setZweites() {
        p1.setZweites(10);
        assertEquals(10, p1.getZweites());
    }

    @Test
    void testToString() {
        assertEquals("SCHEI? BESCHREIBUNG DER AUFGABE", p1.toString());
    }

    @Test
    void testEquals() {
        assertEquals(p1, p2);
    }
}