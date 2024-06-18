package Uebung10;

import Uebung3.Uebung3.MengeDynArray;

public class BuchUtil {
    public static Buch[] sort(MengeDynArray<Buch> m) {
        Buch[] arr = new Buch[m.size()];
        int size = 0;

        for (int i = 0; i < arr.length; i++) {
            Buch tmp = m.get();
            m.delete(tmp);
            if (size == 0) {
                arr[0] = tmp;
                size++;
            } else {
                for (int j = 0; j < size; j++) {
                    Buch tmpArr = arr[j];
                    if(tmp.compareTo(tmpArr) > 0) {
                        j++;
                        if(arr[j+1]==null) {
                            arr[j+1] = tmp;
                        }
                    } else {
                        for (int k = size-1; k >= j; k--) {
                            arr[k+1] = arr[k];
                        }
                        arr[j] = tmp;
                    }
                }
                size++;
            }

        }
        return arr;
    }
}
