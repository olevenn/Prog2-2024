package Uebung4.Uebung3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MengeEVLTest {

    static MengeEVL<Integer> evl;

    @BeforeEach
    void init() {
        evl = new MengeEVL<>();
    }


    @Test
    void size() {
        assertEquals(0, evl.size());
        evl.insert(1);
        assertEquals(1, evl.size());
    }

    @Test
    void isEmpty() {
        assertTrue(evl.isEmpty());
    }

    @Test
    void get() {
        evl.insert(1);
        assertEquals(1, evl.get());
    }

    @Test
    void insert() {
        evl.insert(1);
        assertEquals(1, evl.size());
        evl.insert(1);
        assertEquals(2, evl.size());
    }

    @Test
    void deleteFirst() {
        evl.insert(1);
        evl.insert(2);
        evl.insert(3);
        assertEquals(3, evl.size());

        evl.delete(1);

        assertEquals(2, evl.size());
        assertEquals(2, evl.get());
    }

    @Test
    void deleteLast() {
        evl.insert(1);
        evl.insert(2);
        evl.insert(3);
        assertEquals(3, evl.size());

        evl.delete(3);

        assertEquals(2, evl.size());
        assertEquals(1, evl.get());
    }

    @Test
    void contains() {
        evl.insert(1);

        assertTrue(evl.contains(1));
        assertFalse(evl.contains(2));
    }
}