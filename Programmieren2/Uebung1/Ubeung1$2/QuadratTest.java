package Uebung1.Ubeung1$2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadratTest {

    static Quadrat q1 = new Quadrat(2, 4);

    @Test
    void umfang() {
        assertEquals(16.0, q1.umfang());
    }

    @Test
    void flaeche() {
        assertEquals(16.0, q1.flaeche());
    }

    @Test
    void position() {

    }

    @Test
    void moveTo() {
    }

    @Test
    void eckeLU() {
    }

    @Test
    void eckeRO() {
    }

    @Test
    void kanatenI() {
    }
}