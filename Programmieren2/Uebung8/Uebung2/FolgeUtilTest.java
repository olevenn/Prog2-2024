package Uebung8.Uebung2;

import Uebung8.Uebung1.FolgeAlsDynArray;

public class FolgeUtilTest {
    public static void main(String[] args) {
        FolgeAlsDynArray<Integer> fda = new FolgeAlsDynArray<>(3);

        fda.addLast(10);
        fda.addLast(42);
        fda.addLast(0);
        fda.addLast(8);
        fda.addLast(0);
        fda.addLast(15);
        fda.addLast(0);

        System.out.println(fda);
        System.out.println(fda.size());

        System.out.println(FolgeUtil.frequency(fda, 0));
    }
}
