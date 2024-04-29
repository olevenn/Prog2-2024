package Uebung3.Uebung4;


public class Test {
    public static void main(String[] args) {
        Stud s1 = new Stud("Max", 2000);
        Stud s2 = new Stud("Maxx", 2001);
        Stud s3 = new Stud("Maxxx", 2002);
        Stud s4 = new Stud("Maxxxx", 2003);

        Modul prog2 = new Modul("Programmieren 2", 6);
        Modul dmla = new Modul("Mathe", 9);
        Modul adg = new Modul("ADG", 6);
        Modul krypto = new Modul("Kryptographie", 6);

        s1.anmelden(prog2);
        s1.anmelden(dmla);
        s1.anmelden(adg);
        s1.anmelden(krypto);

        s2.anmelden(prog2);
        s2.anmelden(adg);
        s2.anmelden(krypto);

        s3.anmelden(adg);
        s3.anmelden(krypto);

        s4.anmelden(krypto);

        prog2.addStud(s1);
        prog2.addStud(s2);

        dmla.addStud(s1);

        adg.addStud(s1);
        adg.addStud(s2);
        adg.addStud(s3);

        krypto.addStud(s1);
        krypto.addStud(s2);
        krypto.addStud(s3);
        krypto.addStud(s4);

        s1.belegt();
        krypto.ausgabe();

        s1.abmelden(krypto);
        krypto.removeStud(s1);

        System.out.println("\n");

        s1.belegt();
        krypto.ausgabe();

    }
}
