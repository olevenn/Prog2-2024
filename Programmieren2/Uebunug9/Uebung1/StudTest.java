package Uebunug9.Uebung1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudTest {

    static Stud s1;
    static Stud s2;
    static Stud s3;

    @BeforeEach
    void init() {
        s1 = new Stud("A");
        s2 = new Stud("B");
        s3 = s1;
    }

    @Test
    void compareTo() {
        assertEquals(-1,s1.compareTo(s2));
        assertEquals(1, s2.compareTo(s1));
        assertEquals(0, s1.compareTo(s3));
    }
}