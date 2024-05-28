package Uebung7.Uebung1.b;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SchlangeAlsEVLTest {

    static SchlangeAlsEVL<Integer> schlangeAlsEVL;

    @BeforeEach
    void init(){
        schlangeAlsEVL = new SchlangeAlsEVL<>();
    }

    @Test
    void size() {
        assertEquals(0, schlangeAlsEVL.size());
    }

    @Test
    void isEmpty() {
        assertTrue(schlangeAlsEVL.isEmpty());
    }

    @Test
    void enqueue() {
        schlangeAlsEVL.enqueue(1);
        assertEquals(1, schlangeAlsEVL.size());
        schlangeAlsEVL.enqueue(2);
        schlangeAlsEVL.enqueue(3);
        schlangeAlsEVL.enqueue(4);
        assertEquals(4, schlangeAlsEVL.size());
    }

    @Test
    void dequeue() {
        schlangeAlsEVL.enqueue(1);
        schlangeAlsEVL.enqueue(2);
        schlangeAlsEVL.enqueue(3);
        schlangeAlsEVL.enqueue(4);
        assertEquals(4, schlangeAlsEVL.size());
        schlangeAlsEVL.dequeue();
        assertEquals(3, schlangeAlsEVL.size());
        assertEquals(2, schlangeAlsEVL.front());
    }

    @Test
    void front() {
        schlangeAlsEVL.enqueue(1);
        schlangeAlsEVL.enqueue(2);
        schlangeAlsEVL.enqueue(3);
        schlangeAlsEVL.enqueue(4);
        assertEquals(4, schlangeAlsEVL.size());
        schlangeAlsEVL.dequeue();
        assertEquals(3, schlangeAlsEVL.size());
        assertEquals(2, schlangeAlsEVL.front());
    }
}