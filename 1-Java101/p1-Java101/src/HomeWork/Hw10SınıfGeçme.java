package HomeWork;

import java.util.Scanner;

public class Hw10SınıfGeçme {
    public static void sınıfGecme() {
        int matematik, fizik, kimya, turkce, muzik, bolen = 5;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        matematik = input.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik = input.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya = input.nextInt();

        System.out.print("Turkce Notunuz: ");
        turkce = input.nextInt();

        System.out.print("Müzik Notunuz: ");
        muzik = input.nextInt();

        if (matematik < 0 || matematik > 100) {
            matematik = 0;
            bolen--;
        }
        if (fizik < 0 || fizik > 100) {
            fizik = 0;
            bolen--;
        }
        if (kimya < 0 || kimya > 100) {
            kimya = 0;
            bolen--;
        }
        if (turkce < 0 || turkce > 100) {
            turkce = 0;
            bolen--;
        }
        if (muzik < 0 || muzik > 100) {
            muzik = 0;
            bolen--;
        }
        System.out.println(bolen);

        int toplam = matematik + fizik + kimya + turkce + muzik;
        double avarage = toplam / bolen;

        System.out.println(avarage);
        System.out.println(avarage >= 55 ? "Sınıfı Geçti" : "Sınıfta Kaldı");
    }
}
