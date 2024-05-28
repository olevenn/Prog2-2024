package Uebung7.Uebung1.c;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SchlangeAlsRingpufferTest {

    static SchlangeAlsRingpuffer<Integer> ringpuffer;


    @BeforeEach
    void init() {
        ringpuffer = new SchlangeAlsRingpuffer<>(3);
    }

    @Test
    void size() {
        assertEquals(0, ringpuffer.size());
    }

    @Test
    void capacity() {
        assertEquals(3, ringpuffer.capacity());
    }

    @Test
    void isEmpty() {
        assertTrue(ringpuffer.isEmpty());
    }

    @Test
    void add() {
        ringpuffer.add(1);
        assertEquals(1, ringpuffer.size());
    }

    @Test
    void get() {
        ringpuffer.add(1);
        ringpuffer.add(2);
        ringpuffer.add(3);

        assertEquals(1, ringpuffer.get());
    }

    @Test
    void remove() {
        ringpuffer.add(1);
        ringpuffer.add(2);
        ringpuffer.add(3);

        ringpuffer.remove();
        assertEquals(2, ringpuffer.size());
        ringpuffer.remove();
        assertEquals(1, ringpuffer.size());
        ringpuffer.remove();
        assertEquals(0, ringpuffer.size());
    }

    @Test
    void testException() {
        ringpuffer.add(1);
        ringpuffer.add(2);
        ringpuffer.add(3);
        assertThrows(IllegalStateException.class, () -> ringpuffer.add(4));
    }
}