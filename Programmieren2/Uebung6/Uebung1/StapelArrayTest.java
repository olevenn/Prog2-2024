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
}