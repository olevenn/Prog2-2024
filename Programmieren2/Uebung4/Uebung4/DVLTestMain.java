package Uebung4.Uebung4;

public class DVLTestMain {
    public static void main(String[] args) {
        DVL<Integer> dvl = new DVL<>();

        dvl.append(1);
        dvl.append(2);
        dvl.append(3);

        System.out.println(dvl);
        System.out.println("Size " + dvl.size());

        dvl.delete(1);

        System.out.println(dvl);
        System.out.println("Size " + dvl.size());
    }
}
