package HomeWork;

import java.util.Scanner;

public class Hw2KDV {
    public static void KdvHesapla() {
        double tutar, kdvOrani = 0, kdvTutari, kdvliTutar;

        Scanner input = new Scanner(System.in);
        System.out.print("Tutar giriniz : ");
        tutar = input.nextInt();

        if (0 <= tutar && tutar <= 1000) {
            kdvOrani = 0.18;
        } else if (tutar > 1000) {
            kdvOrani = 0.8;
        }

        kdvTutari = tutar * kdvOrani;
        System.out.println("tutar: " + tutar);
        System.out.println("kdvOrani: " + kdvOrani);
        System.out.println("kdvTutari: " + kdvTutari);
        kdvliTutar = tutar + kdvTutari;

        System.out.println(kdvliTutar);
    }
}
