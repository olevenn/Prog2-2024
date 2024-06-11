package Uebung9.Uebung2;

import Uebung2.Uebung3.Menge;
import Uebung9.Uebung1.Stud;

/**
 * Wir gehen einfach immer das neue Array durch und vergleichen tmp mit dem Wert im Array, wenn tmp größer ist gehen wir
 * im Array 1 Schritt weiter, bis eine leere Stelle kommt.
 * Bei allen anderen Fällen(tmp kleiner oder gleich) schieben wir alle vorhanden Werte im Array 1 nach hinten und fügen
 * tmp ein
 *
 * Duplikate gehen nicht weil MengeLimited die erst garnicht hinzufügt in die Liste
 */


public class StudUtil {
    public static Stud[] sort(Menge<Stud> m) {
        Stud[] arr = new Stud[m.size()];
        int size = 0;

        for (int i = 0; i < arr.length; i++) {
            Stud tmp = m.get();
            m.delete(tmp);
            if (size == 0) {
                arr[0] = tmp;
                size++;
            } else {
                for (int j = 0; j < size; j++) {
                    Stud tmpArr = arr[j];
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
