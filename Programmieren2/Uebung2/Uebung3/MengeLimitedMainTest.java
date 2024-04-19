package Uebung2.Uebung3;

public class MengeLimitedMainTest {
    public static void main(String[] args) throws Exception {
        MengeLimited<String> ml = new MengeLimited<>();
        MengeLimited<String> ml1 = new MengeLimited<>();


        for (int i = 0; i < 50; i++) {
            ml.insert(String.valueOf(i));
        }

        for (int i = 50; i < 100; i++) {
            ml1.insert(String.valueOf(i));
        }

        System.out.println(ml);

        MengeUtil.merge(ml, ml1);

        System.out.println(ml);
    }
}
