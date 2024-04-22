package Uebung3.Uebung3;

public class MengeDynArray<T> implements Menge<T> {

    private int size;
    private T[] array;
    private int maxGroesse;
    private int originalsize;

    @SuppressWarnings("unchecked")
    public MengeDynArray(int size) {
        array = (T[]) new Object[size];
        this.originalsize = size;
        this.maxGroesse = size;
        this.size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public T get() {
        return array[0];
    }

    @Override
    public void insert(T e) {
        if (this.contains(e))
            return;
        if (size >= array.length)
            throw new ArrayIndexOutOfBoundsException("Menge voll");
        array[size] = e;
        size++;
        increase();
    }

    @Override
    public void delete(T e) {
        for (int i = 0; i < size; i++) {
            if (e.equals(array[i])) {
                for (int j = i; j < size - 1; j++)
                    array[j] = array[j + 1];
                size--;
                return;
            }
        }
        decrease();
    }

    @Override
    public boolean contains(T e) {
        for (int i = 0; i < size; i++)
            if (e.equals(array[i]))
                return true;
        return false;
    }

    @Override
    public String toString() {
        String s = "{";
        for (int i = 0; i < size; i++)
            s = s + (array[i] + ", ");
        return s + "}";
    }


    @SuppressWarnings("unchecked")
    public void decrease() {
        if (size <= maxGroesse / 4)
            if (size < originalsize)
                ;
            else {
                maxGroesse = maxGroesse / 2;
                T[] neu = (T[]) new Object[maxGroesse];
                for (int i = 0; i < size; i++)
                    neu[i] = array[i];
                array = neu;
            }
    }

    @SuppressWarnings("unchecked")
    private void increase() {
        T[] neu = (T[]) new Object[array.length * 2];
        for (int i = 0; i < size; i++)
            neu[i] = array[i];
        array = neu;
        maxGroesse *= 2;
    }
}
