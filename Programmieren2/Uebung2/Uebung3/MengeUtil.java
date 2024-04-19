package Uebung2.Uebung3;

public class MengeUtil {

    static <T> void merge(Menge<T> m1, Menge<T> m2) throws Exception {
        if ((m1.size() + m2.size()) > 100) {
            throw new Exception("Sind zusammen über 100 Elemente");
        }
        int m2size = m2.size();
        for (int i = 0; i < m2size; i++) {
            T tmp = m2.get();
            m1.insert(tmp);
            m2.delete(tmp);
        }
    }
}
