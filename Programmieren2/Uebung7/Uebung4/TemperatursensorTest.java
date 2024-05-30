package Uebung7.Uebung4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatursensorTest {

    Temperatursensor temperatursensor;

    @BeforeEach
    void init() {
        temperatursensor = new Temperatursensor(4);
    }

    @Test
    void neueMessung() {
        temperatursensor.neueMessung(1F);
        assertEquals(1, temperatursensor.ringpufferLIFO.size());
    }

    @Test
    void aktuelleTemperatur() {
        temperatursensor.neueMessung(1F);
        assertEquals(1F, temperatursensor.aktuelleTemperatur());
        temperatursensor.neueMessung(5F);
        assertEquals(5F, temperatursensor.aktuelleTemperatur());
    }

    @Test
    void durchschnittsTemperatur() {
        assertEquals(Float.NaN, temperatursensor.durchschnittsTemperatur());
        temperatursensor.neueMessung(1F);
        assertEquals(1F, temperatursensor.durchschnittsTemperatur());
        temperatursensor.neueMessung(5F);
        assertEquals(3F, temperatursensor.durchschnittsTemperatur());
    }

    @Test
    void reset() {
        temperatursensor.neueMessung(1F);
        temperatursensor.neueMessung(1F);
        temperatursensor.neueMessung(1F);
        temperatursensor.neueMessung(1F);
        temperatursensor.neueMessung(1F);
        temperatursensor.reset();
        assertEquals(Float.NaN, temperatursensor.durchschnittsTemperatur());

    }
}