package Uebung4.Uebung4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DVLTest {

    static DVL<Integer> dvl;

    @BeforeEach
    void init() {
        dvl = new DVL<>();
    }

    @Test
    void size() {
        assertEquals(0, dvl.size());
        dvl.append(1);
        assertEquals(1, dvl.size());
    }

    @Test
    void isEmpty() {
        assertTrue(dvl.isEmpty());
    }

    @Test
    void getFirst() {
        dvl.append(1);
        dvl.append(2);
        dvl.append(3);

        assertEquals(1, dvl.getFirst());
    }

    @Test
    void getLast() {
        dvl.append(1);
        dvl.append(2);
        dvl.append(3);

        assertEquals(3, dvl.getLast());
    }

    @Test
    void insert() {
        //andersherum eingefügt
        dvl.insert(3);
        dvl.insert(2);
        dvl.insert(1);
        assertEquals(1, dvl.getFirst());
        assertEquals(3, dvl.getLast());
        assertEquals(3, dvl.size());
    }

    @Test
    void append() {
        dvl.append(1);
        dvl.append(2);
        dvl.append(3);

        assertEquals(1, dvl.getFirst());
        assertEquals(3, dvl.getLast());
        assertEquals(3, dvl.size());
    }

    @Test
    void removeFirst() {
        dvl.append(1);
        dvl.append(2);
        dvl.append(3);

        dvl.removeFirst();
        assertEquals(2, dvl.getFirst());
        assertEquals(3, dvl.getLast());
        assertEquals(2, dvl.size());
    }

    @Test
    void removeLast() {
        dvl.append(1);
        dvl.append(2);
        dvl.append(3);

        dvl.removeLast();
        assertEquals(1, dvl.getFirst());
        assertEquals(2, dvl.getLast());
        assertEquals(2, dvl.size());
    }

    @Test
    void contains() {
        dvl.append(1);
        dvl.append(2);
        dvl.append(3);

        assertTrue(dvl.contains(1));
        assertTrue(dvl.contains(2));
        assertTrue(dvl.contains(3));

        assertFalse(dvl.contains(4));
    }

    @Test
    void deleteFirst() {
        dvl.append(1);
        dvl.append(2);
        dvl.append(3);

        dvl.delete(1);

        assertEquals(2, dvl.getFirst());
        assertEquals(3, dvl.getLast());
        assertEquals(2, dvl.size());
    }

    @Test
    void deleteMiddle() {
        dvl.append(1);
        dvl.append(2);
        dvl.append(3);

        dvl.delete(2);

        assertEquals(1, dvl.getFirst());
        assertEquals(3, dvl.getLast());
        assertEquals(2, dvl.size());
    }

    @Test
    void deleteLast() {
        dvl.append(1);
        dvl.append(2);
        dvl.append(3);

        dvl.delete(3);

        assertEquals(1, dvl.getFirst());
        assertEquals(2, dvl.getLast());
        assertEquals(2, dvl.size());
    }
}