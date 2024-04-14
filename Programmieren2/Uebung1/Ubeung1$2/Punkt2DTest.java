package Uebung1.Ubeung1$2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Punkt2DTest {

    static Punkt2D p1 = new Punkt2D();
    static Punkt2D p2 = new Punkt2D();

    @BeforeEach
    void init() {
        p1.setX(2.0);
        p1.setY(2.0);
        p2.setX(5.0);
        p2.setY(6.0);
    }

    @Test
    void x() {
        assertEquals(2.0, p1.x());
        assertEquals(5.0, p2.x());
    }

    @Test
    void y() {
        assertEquals(2.0, p1.y());
        assertEquals(6.0, p2.y());
    }

    @Test
    void setX() {
        p1.setX(4.0);
        assertEquals(4.0, p1.x());
    }

    @Test
    void setY() {
        p2.setY(4.0);
        assertEquals(4.0, p2.y());
    }

    @Test
    void abstand() {
        assertEquals(5.0, p1.abstand(p2));
    }
}