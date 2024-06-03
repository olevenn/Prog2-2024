package Uebung8.Uebung1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class FolgeAlsDynArrayTest {

    static FolgeAlsDynArray<Integer>fda;

    @BeforeEach
    void init() {
        fda = new FolgeAlsDynArray<>(3);
    }


    @Test
    void size() {
        assertEquals(0, fda.size());
        fda.addFirst(1);
        assertEquals(1, fda.size());
    }

    @Test
    void isEmpty() {
        assertTrue(fda.isEmpty());
        fda.addFirst(0);
        assertFalse(fda.isEmpty());
    }

    @Test
    void contains() {
        fda.addFirst(1);
        assertTrue(fda.contains(1));
        assertFalse(fda.contains(2));

    }

    @Test
    void get() {
        fda.addFirst(2);
        fda.addFirst(1);
        fda.addFirst(0);

        assertEquals(0, fda.get(0));
        assertEquals(1, fda.get(1));
        assertEquals(2, fda.get(2));

        assertThrows(IndexOutOfBoundsException.class, () -> fda.get(4));
    }

    @Test
    void set() {
        fda.addFirst(2);
        fda.addFirst(1);
        fda.addFirst(0);

        fda.set(0, 10);
        assertEquals(10, fda.get(0));

        assertThrows(IndexOutOfBoundsException.class, () -> fda.set(5, 5));
    }

    @Test
    void pos() {
        fda.addFirst(2);
        fda.addFirst(1);
        fda.addFirst(0);

        assertEquals(0, fda.pos(0));
        assertEquals(1, fda.pos(1));
        assertEquals(2, fda.pos(2));

        assertThrows(NoSuchElementException.class, () -> fda.pos(10));
    }

    @Test
    void insert() {
        fda.addFirst(2);
        fda.addFirst(1);
        fda.addFirst(0);

        fda.insert(0, 3);

        assertEquals(3, fda.get(0));
        assertEquals(2, fda.get(3));

        assertThrows(IndexOutOfBoundsException.class, () -> fda.insert(5, 200));

    }

    @Test
    void addFirst() {
        fda.addFirst(1);
        fda.addFirst(0);

        assertEquals(0, fda.get(0));
        assertEquals(1, fda.get(1));
    }

    @Test
    void addLast() {
        fda.addLast(0);
        fda.addLast(1);

        assertEquals(0, fda.get(0));
        assertEquals(1, fda.get(1));

    }

    @Test
    void remove() {
        fda.addFirst(2);
        fda.addFirst(1);
        fda.addFirst(0);

        fda.remove(2);
        assertEquals(2, fda.size());

        assertThrows(IndexOutOfBoundsException.class, () -> fda.remove(5));

    }

    @Test
    void delete() {
        fda.addFirst(2);
        fda.addFirst(1);
        fda.addFirst(0);

        fda.delete(1);

        assertEquals(2, fda.size());
        assertEquals(2, fda.get(1));
    }

    @Test
    void iterator() {
        Iterator<Integer> iterator = fda.iterator();
        fda.addFirst(2);
        fda.addFirst(1);
        fda.addFirst(0);

        assertTrue(iterator.hasNext());
        assertEquals(0, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(1, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(2, iterator.next());
    }
}