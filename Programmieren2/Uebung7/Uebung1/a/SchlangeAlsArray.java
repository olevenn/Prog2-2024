package Uebung7.Uebung1.a;

public class SchlangeAlsArray<T> {
    private T[] arr;
    private int size;
    private int maxGroesse;

    @SuppressWarnings("unchecked")
    public SchlangeAlsArray(int maxSize) {
        arr = (T[]) new Object[maxSize];
        size = 0;
        this.maxGroesse = maxSize;
    }

    public T front() {
        return arr[0];
    }

    public void enqueue(T e) {
        if (size >= arr.length)
            increase();
        arr[size] = e;
        size++;
    }

    public void dequeue() {
        if (arr[0] == null)
            throw new IndexOutOfBoundsException("Das Array ist leer!");

        //Einrücken
        for (int i = 0; i < size-1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[size-1] = null; //damit die Ausgabe verständlicher ist
        size--;
        decrease();
    }

    public int getSize() {
        return size;
    }

    @SuppressWarnings("unchecked")
    public void decrease() {
        if (size <= maxGroesse / 4) {
            maxGroesse = maxGroesse / 2;
            T[] neu = (T[]) new Object[maxGroesse];
            for (int i = 0; i < size; i++)
                neu[i] = arr[i];
            arr = neu;
        }
    }

    @SuppressWarnings("unchecked")
    private void increase() {
        T[] neu = (T[]) new Object[arr.length * 2];
        for (int i = 0; i < size; i++)
            neu[i] = arr[i];
        arr = neu;
        maxGroesse *= 2;
    }

    @Override
    public String toString() {
        StringBuilder ausgabe = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            ausgabe.append(arr[i]).append(" ");
        }
        return ausgabe.toString();
    }

    public int maxSize(){
        return arr.length;
    }
}
