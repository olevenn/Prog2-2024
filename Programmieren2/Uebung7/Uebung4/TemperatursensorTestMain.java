package Uebung7.Uebung4;

public class TemperatursensorTestMain {
    public static void main(String[] args) {
        Temperatursensor temperatursensor = new Temperatursensor(4);
        temperatursensor.neueMessung(1F);

        System.out.println(temperatursensor.ringpufferLIFO);
        System.out.println(temperatursensor.durchschnittsTemperatur());
    }
}
