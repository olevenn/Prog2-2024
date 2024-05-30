package Uebung7.Uebung3;

import java.util.Iterator;

public class RingpufferLIFOTestMain {
    public static void main(String[] args) {
        RingpufferLIFO<Integer> test = new RingpufferLIFO<>(3);

        test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);


        for (Integer i: test) {
            System.out.println(i);
        }
    }
}
