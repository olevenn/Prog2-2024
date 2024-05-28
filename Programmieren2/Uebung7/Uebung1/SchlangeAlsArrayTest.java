package Uebung7.Uebung1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SchlangeAlsArrayTest {

    static SchlangeAlsArray<Integer> sArray;

    @BeforeEach
    void init(){
        sArray = new SchlangeAlsArray<>(2);
    }


    @Test
    void front() {
        sArray.enqueue(1);
        sArray.enqueue(2);
        sArray.enqueue(3);

        assertEquals(1, sArray.front());
    }

    @Test
    void enqueue() {
        assertEquals(0, sArray.getSize());
        sArray.enqueue(1);
        assertEquals(1, sArray.getSize());
        sArray.enqueue(2);
        assertEquals(2, sArray.getSize());
    }

    @Test
    void dequeue() {
        sArray.enqueue(1);
        sArray.enqueue(2);
        sArray.enqueue(3);
        assertEquals(3, sArray.getSize());

        sArray.dequeue();
        assertEquals(2, sArray.getSize());
        sArray.dequeue();
        assertEquals(1, sArray.getSize());
        sArray.dequeue();
        assertEquals(0, sArray.getSize());
    }
}