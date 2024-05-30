package Uebung7.Uebung4;

import Uebung7.Uebung3.RingpufferLIFO;

public class Temperatursensor {

    RingpufferLIFO<Float> ringpufferLIFO;
    private int maxSpeicher;

    public Temperatursensor(int wert) {
        ringpufferLIFO = new RingpufferLIFO<>(wert);
        maxSpeicher = wert;
    }

    public void neueMessung(Float wert) {
        ringpufferLIFO.add(wert);
    }

    public Float aktuelleTemperatur() {
        return ringpufferLIFO.get();
    }

    public Float durchschnittsTemperatur() {
        if (ringpufferLIFO.isEmpty())
            return Float.NaN;
        float ausgabe = 0;
        for (Float f :
                ringpufferLIFO) {
            if(f==null)
                ;
            else
                ausgabe += f;
        }
        return ausgabe / ringpufferLIFO.size();
    }

    public void reset() {
        ringpufferLIFO = new RingpufferLIFO<>(maxSpeicher);
    }

}
