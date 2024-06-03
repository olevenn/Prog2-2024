package Uebung8.Uebung2;

import Uebung8.Folge;

public class FolgeUtil<T> {

    public static <T> int frequency(Folge<T> f, T v) {
        int counter = 0;
        for (T tmp : f) {
            if(tmp == v)
                counter++;
        }
        return counter;
    }

    public static <T> void swap(Folge<T> f, int i, int j) {
        T tmp = f.get(i);
        f.set(i, f.get(j));
        f.set(j, tmp);
    }

    public static <T> void rotate(Folge<T> f, int d) {
        for (int i = 0; i < d; i++) {
            f.addFirst(f.get(f.size()-1));
            f.remove(f.size());
        }
    }


}
