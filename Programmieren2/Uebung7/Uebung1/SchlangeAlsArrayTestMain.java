package Uebung7.Uebung1;

public class SchlangeAlsArrayTestMain {
    public static void main(String[] args) {
        SchlangeAlsArray<Integer> schlangeAlsArray = new SchlangeAlsArray<>(20);
        for (int i = 0; i < 20; i++) {
            schlangeAlsArray.enqueue(i);
        }

        for (int i = 0; i < 16; i++) {
            schlangeAlsArray.dequeue();
            System.out.println(schlangeAlsArray.getSize());
            System.out.println(schlangeAlsArray);
        }

    }
}
