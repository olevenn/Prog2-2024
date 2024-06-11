package Uebung9.Uebung2;
import Uebung2.Uebung3.Menge;
import Uebung9.Uebung1.Stud;
import Uebung2.Uebung3.MengeLimited;

public class TestMain {
    public static void main(String[] args) {
        Stud s1 = new Stud("A");
        Stud s2 = new Stud("B");
        Stud s3 = new Stud("C");
        Stud s4 = new Stud("D");

        MengeLimited<Stud> ml = new MengeLimited<>();
        ml.insert(s2);
        ml.insert(s1);
        ml.insert(s4);
        ml.insert(s3);

        Stud []test = StudUtil.sort(ml);

        for (Stud stud : test) {
            System.out.println(stud);
        }

    }
}
