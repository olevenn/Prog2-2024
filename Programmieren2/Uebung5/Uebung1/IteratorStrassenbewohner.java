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

    /**
     * Wenn wir die geraden Indexe abarbeiten schauen wir, wann wir das obere Limit erreich haben,
     * wenn wir die ungerade Indexe abarbeiten schauen wir, wann wir bei 0 sind
     */
    @Override
    public boolean hasNext() {
        return (iterateEvenIndices ? index < array.length : index > 0);
    }

    /**
     * Wir gehen erst die gerade Indexe hoch und sobald wir das Ende erreich haben schauen wir ob wir ein gerade Array
     * oder ungerade Arrays haben damit wir je nachdem den Index -1 oder -2 rechnen (damit das zurückgehen richtig funktioniert)
     * Wenn wir nach unten gehen rechnen wir immer -2
     * @return Immer das StrassenbewohnerElement
     */
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
