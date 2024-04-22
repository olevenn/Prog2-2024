package Uebung3.Uebung3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MengeDynArrayTest {
    static MengeDynArray<String> mda;

    @BeforeEach
    void init(){
        mda = new MengeDynArray<>(2);
    }

    @Test
    void size() {
        assertEquals(0, mda.size());
        mda.insert("Test");
        assertEquals(1, mda.size());
    }

    @Test
    void isEmpty() {
        assertTrue(mda.isEmpty());
    }

    @Test
    void get() {
        mda.insert("Test");
        assertEquals("Test", mda.get());
    }

    @Test
    void insert() {
        mda.insert("Test");
        mda.insert("Test1");
        mda.insert("Test2");
        mda.insert("Test3");
        assertEquals("Test", mda.get());
        assertEquals(4, mda.size());
    }

    @Test
    void delete() {
        mda.insert("Test");
        mda.insert("Test1");
        mda.delete("Test1");
        assertEquals(1, mda.size());
        assertEquals("Test", mda.get());

        mda.delete("Test");
        assertEquals(0, mda.size());
    }

    @Test
    void contains() {
        mda.insert("Test");

        assertTrue(mda.contains("Test"));
        assertFalse(mda.contains("Test1"));
    }
}