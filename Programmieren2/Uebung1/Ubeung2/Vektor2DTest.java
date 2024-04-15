package Uebung1.Ubeung2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Vektor2DTest {

    static Vektor2D v1 = new Vektor2D(2.0, 3.0);
    static Vektor2D v2 = new Vektor2D(2.0, 4.0);

    @Test
    void add() {
        Vektor2D v3 = (Vektor2D) v1.add(v2);
        assertEquals(4.0, v3.x());
        assertEquals(7.0, v3.y());
    }

    @Test
    void laenge() {
        assertEquals(Math.sqrt(13), v1.laenge());
        assertEquals(2*Math.sqrt(5), v2.laenge());
    }
}