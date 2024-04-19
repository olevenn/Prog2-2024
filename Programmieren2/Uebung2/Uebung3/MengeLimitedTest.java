package Uebung2.Uebung3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MengeLimitedTest {

    static MengeLimited<String> ml;

    @BeforeEach
    void init(){
        ml = new MengeLimited<>();
    }

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
        ml.insert("Test");
        assertEquals("Test", ml.get());
    }

    @Test
    void insert() {
        ml.insert("Test");
        assertEquals("Test", ml.get());
        assertEquals(1, ml.size());
    }

    @Test
    void delete() {
        ml.insert("Test");
        ml.insert("Test1");
        ml.delete("Test1");
        assertEquals(1, ml.size());
        assertEquals("Test", ml.get());

        ml.delete("Test");
        assertEquals(0, ml.size());
    }

    @Test
    void contains() {
        ml.insert("Test");

        assertTrue(ml.contains("Test"));
        assertFalse(ml.contains("Test1"));
    }
}