package Uebung6.Uebung2;

import Uebung6.Uebung1.DynArray.DynArray;
import Uebung6.Uebung1.EVL.EVLStapel;
import Uebung6.Uebung1.Stapel;

public class A2 {

    public static boolean check(String[] words) {
        DynArray<Paar<String, String>> pairs = new DynArray<>();
        pairs.add(new Paar<>("(",")"));
        pairs.add(new Paar<>("[","]"));
        pairs.add(new Paar<>("{","}"));
        pairs.add(new Paar<>("beginn","end"));
        pairs.add(new Paar<>("start","stop"));

        Stapel<String> stack = new EVLStapel<>();

        for (String word: words) {
            for (Paar<String, String> pair : pairs) {
                if(pair.getErstes().equals(word)) {
                    stack.push(word);
                    break;
                } else if(pair.getZweites().contains(word)) {
                    if(stack.isEmpty() || !pair.getErstes().equals(stack.top()))
                        return false;
                    stack.pop();
                    break;
                }
            }
        }
    return stack.isEmpty();
    }
}
