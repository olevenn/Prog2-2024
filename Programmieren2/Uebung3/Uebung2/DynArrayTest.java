package Uebung3.Uebung2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class DynArrayTest {

    static DynArray<Integer> dynArrayInteger;

    @BeforeEach
    void setIntegerDynArray(){
        dynArrayInteger = new DynArray<>(10);
    }


    @Test
    void removeExceptionTest() {
        assertThrows(IndexOutOfBoundsException.class, () -> dynArrayInteger.remove(11));
        assertThrows(IndexOutOfBoundsException.class, () -> dynArrayInteger.remove(1));
    }

    @Test
    void removeTest() {
        dynArrayInteger.add(0);
        dynArrayInteger.remove(0);
        assertEquals(0, dynArrayInteger.size());
    }

    @Test
    void testRemoveNoParaException() {
        assertThrows(IndexOutOfBoundsException.class, () -> dynArrayInteger.remove());
    }

    @Test
    void testRemoveNoPara() {
        dynArrayInteger.add(1);
        dynArrayInteger.remove();
        assertEquals(0, dynArrayInteger.size());
    }

    @Test
    void deleteElement() {
        dynArrayInteger.add(100);
        assertEquals(1, dynArrayInteger.size());
        dynArrayInteger.delete(100);
        assertEquals(0, dynArrayInteger.size());


        for (int i = 0; i < 5; i++) {
            dynArrayInteger.add(i);
        }

        dynArrayInteger.add(3);
        dynArrayInteger.delete(3);
        dynArrayInteger.delete(3);

        dynArrayInteger.delete(0);
    }

    @Test
    void deleteElementException() {
        assertThrows(NoSuchElementException.class, () -> dynArrayInteger.delete(10));
    }

    @Test
    void contains() {
        assertFalse(dynArrayInteger.contains(10));
        dynArrayInteger.add(20);
        assertTrue(dynArrayInteger.contains(20));
    }

    @Test
    void decrease() {
        DynArray<Integer> dynArray3 = new DynArray<>(2);
        for (int i = 0; i < 32; i++) {
            dynArray3.add(i);
        }
        assertEquals(32, dynArray3.size());
        for (int i = 0; i < 27; i++) {
            dynArray3.remove();
        }
        assertEquals(16, dynArray3.arraySize());
    }

    @Test
    void size() {
        assertEquals(0, dynArrayInteger.size());
        dynArrayInteger.add(1);
        assertEquals(1, dynArrayInteger.size());
    }

    @Test
    void set() {
        dynArrayInteger.add(1);
        dynArrayInteger.set(0, 10);
        assertEquals(10, dynArrayInteger.get(0));
    }

    @Test
    void setException() {
        assertThrows(IndexOutOfBoundsException.class, ()->dynArrayInteger.set(1, 2));
    }

    @Test
    void get() {
        dynArrayInteger.add(0);
        dynArrayInteger.add(1);
        dynArrayInteger.add(2);
        assertEquals(0, dynArrayInteger.get(0));
        assertEquals(2, dynArrayInteger.get(2));
    }

    @Test
    void getException() {
        assertThrows(IndexOutOfBoundsException.class, () -> dynArrayInteger.get(20));
    }

    @Test
    void add() {
        dynArrayInteger.add(1);
        assertEquals(1, dynArrayInteger.size());
    }
}