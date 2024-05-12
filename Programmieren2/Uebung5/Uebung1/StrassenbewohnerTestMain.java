package Uebung5.Uebung1;


public class StrassenbewohnerTestMain {
    public static void main(String[] args) {
        Strassenbewohner[] strassenbewohners = new Strassenbewohner[]{null, new Strassenbewohner(1, "Anna"), new Strassenbewohner(2, "Ben"), new Strassenbewohner(3, "Chris"), new Strassenbewohner(4, "Didi"), new Strassenbewohner(5, "Eve")};

        IteratorStrassenbewohner<Strassenbewohner> is = new IteratorStrassenbewohner<>(strassenbewohners);

        while (is.hasNext()) {
            Strassenbewohner tmp = is.next();
            if(tmp != null) {
                System.out.println(tmp);
            }

        }
    }
}
