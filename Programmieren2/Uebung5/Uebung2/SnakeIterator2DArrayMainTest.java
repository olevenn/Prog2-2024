package Uebung5.Uebung2;

import java.util.Iterator;

public class SnakeIterator2DArrayMainTest {
    public static void main(String[] args) {
        Integer [][] a = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};

        Iterator<Integer> is = new SnakeIterator2DArray<>(a);

        while (is.hasNext()) {
            System.out.println(is.next());
        }
    }
}
