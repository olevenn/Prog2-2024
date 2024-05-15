package Uebung6.Uebung1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class StapelArrayTest {

    static StapelArray<Integer> arr;

    @BeforeEach
    void init(){
        arr = new StapelArray<>(5);
    }

    @Test
    void top() {
        arr.push(1);
        arr.push(2);
        assertEquals(2, arr.top());
        arr.push(3);
        assertEquals(3, arr.top());
    }

    @Test
    void push() {
        assertTrue(arr.isEmpty());
        arr.push(1);
        assertEquals(1, arr.size());
        arr.push(2);
        assertEquals(2, arr.size());
    }

    @Test
    void pop() {
        arr.push(1);
        arr.push(2);
        arr.push(3);
        assertEquals(3, arr.size());
        arr.pop();
        assertEquals(2, arr.top());
        assertEquals(2, arr.size());

        arr.pop();
        assertEquals(1, arr.top());
        assertEquals(1, arr.size());
    }

    @Test
    void test() {
        arr.push(1);
        arr.pop();
        assertThrows(NoSuchElementException.class, () -> arr.top());
    }

    @Test
    void increase() {
        arr = new StapelArray<>(2);
        assertEquals(2, arr.maxsize());
        arr.push(1);
        arr.push(2);
        arr.push(3);
        assertEquals(3, arr.size());
        assertEquals(4, arr.maxsize());
    }

    @Test
    void decreaseTest() {
        arr = new StapelArray<>(9);
        for (int i = 0; i < 8; i++) {
            arr.push(i);
        }
        assertEquals(8, arr.size());
        assertEquals(9, arr.maxsize());
        for (int i = 0; i < 6; i++) {
            arr.pop();
        }
        assertEquals(2, arr.size());
        assertEquals(4, arr.maxsize());

    }
}