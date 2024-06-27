package Uebung11.Uebung3;

public class MengeUtil<T> {
    void merge(Menge<T> a, Menge<T> b) {
        for (T tmp : b) {
            a.insert(tmp);}
    }

}
