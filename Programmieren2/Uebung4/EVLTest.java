package Uebung4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EVLTest {

    EVL<Integer> evl;


    @BeforeEach
    void init() {
        evl = new EVL<>();
    }

    @Test
    void size() {
        assertEquals(0, evl.size());

        evl.insert(1);
        evl.append(2);

        assertEquals(2, evl.size());
    }

    @Test
    void isEmpty() {
        assertTrue(evl.isEmpty());
    }

    @Test
    void append() {
        evl.append(1);
        evl.append(2);
        evl.append(3);
        assertEquals(3, evl.size());
    }

    @Test
    void insert() {
        evl.insert(1);
        evl.insert(2);

        assertEquals(2, evl.getFirst());
        assertEquals(2, evl.size());
    }

    @Test
    void getFirst() {
        evl.insert(1);
        evl.append(2);
        evl.append(3);

        assertEquals(1, evl.getFirst());
    }

    @Test
    void getLast() {
        evl.insert(1);
        evl.append(2);
        evl.append(3);

        assertEquals(3, evl.getLast());
    }

    @Test
    void removeFirst() {
        evl.append(1);
        evl.append(2);
        evl.append(3);

        assertEquals(3, evl.size());

        evl.removeFirst();

        assertEquals(2, evl.size());
        assertEquals(2, evl.getFirst());
        assertEquals(3, evl.getLast());
    }

    @Test
    void removeLast() {
        evl.append(1);
        evl.append(2);
        evl.append(3);

        assertEquals(3, evl.size());

        evl.removeLast();

        assertEquals(2, evl.size());
        assertEquals(1, evl.getFirst());
        assertEquals(2, evl.getLast());
    }

    @Test
    void delete() {
        evl.append(1);
        evl.append(2);
        evl.append(3);

        assertEquals(3, evl.size());

        evl.delete(2);

        assertEquals(2, evl.size());
        assertEquals(1, evl.getFirst());
        assertEquals(3, evl.getLast());
    }
}