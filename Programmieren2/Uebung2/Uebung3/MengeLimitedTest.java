package Uebung2.Uebung3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MengeLimitedTest {

    static MengeLimited<String> ml = new MengeLimited<>();

    @Test
    void size() {
        assertEquals(0, ml.size());
        ml.insert("Test");
        assertEquals(1, ml.size());
    }

    @Test
    void isEmpty() {
        assertTrue(ml.isEmpty());
    }

    @Test
    void get() {
    }

    @Test
    void insert() {

    }

    @Test
    void delete() {
    }

    @Test
    void contains() {
    }
}