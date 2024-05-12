package Uebung5.Uebung1;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IteratorStrassenbewohner<T> implements Iterator<T> {
    T[] array;
    int index = 0;
    private boolean iterateEvenIndices = true;
    private boolean isEvenLength;

    public IteratorStrassenbewohner(T[] strassenbewohners) {
        this.array = strassenbewohners;
        isEvenLength = array.length % 2 == 0;
    }

    @Override
    public boolean hasNext() {
        return (iterateEvenIndices ? index < array.length : index > 0);
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }

        T element = array[index];
        if (iterateEvenIndices) {
            index += 2;
            if (index >= array.length) {
                index = array.length - (isEvenLength ? 1 : 2);
                iterateEvenIndices = false;
            }
        } else {
            index -= 2;
        }
        return element;
    }
}
