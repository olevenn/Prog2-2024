package Uebung5.Uebung2;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class SnakeIterator2DArray <T> implements Iterator<T> {

    private int z = 0;
    private int s = 0;
    private T [][] arr;

    SnakeIterator2DArray (T [][] array){
        this.arr = array;
    }

    @Override
    public boolean hasNext() {
        if(arr.length-1 >= z && arr[arr.length-1].length >= s )
            return true;
        return false;
    }

    @Override
    public T next() {
        if(!hasNext())
            throw new NoSuchElementException();

        T element;

        if(z % 2 == 0) {
            element = arr[z][s];
            s++;
            try { //Ist hier nur nötig wegen dem aller letzten Element was sonst faxen macht
                if(arr[z].length-1 < s && hasNext()) {
                    z++;
                    s = arr[z].length-1;
                }
            } catch (ArrayIndexOutOfBoundsException e) {}

        } else {
            element = arr[z][s];
            if(s == 0) {
                z++;
                s = 1;
            }
            s--;
        }
        return element;
    }
}
