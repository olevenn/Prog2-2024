package Uebung7.Uebung1.c;

public class SchlangeAlsRingpufferMainTest {
    public static void main(String[] args) {
        SchlangeAlsRingpuffer<Integer> sRing = new SchlangeAlsRingpuffer<>(5);
        sRing.add(0);
        sRing.add(1);
        sRing.add(2);
        sRing.add(3);
        sRing.add(4);
        sRing.remove();
        sRing.remove();
        sRing.remove();
        System.out.println(sRing);

        sRing.add(20);
        sRing.add(30);
        sRing.add(40);
        System.out.println(sRing);

        sRing.remove();
        sRing.add(50);
        System.out.println(sRing);


    }
}
