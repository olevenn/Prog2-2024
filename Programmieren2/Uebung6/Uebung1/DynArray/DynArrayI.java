package Uebung6.Uebung1.DynArray;

public interface DynArrayI<T> {
    int size();
    boolean isEmpty();
    void set(int pos, T e) throws IndexOutOfBoundsException;
    T get(int pos) throws IndexOutOfBoundsException;
    void add(T e);
    boolean contains(T e);
    void delete(T e);
    void remove(int pos);
}
