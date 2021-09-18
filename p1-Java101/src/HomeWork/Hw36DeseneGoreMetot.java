package HomeWork;

import java.util.Scanner;

public class Hw36DeseneGoreMetot {
/*
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        sayi = input.nextInt();
        System.out.print(sayi +" ");
        kural1(sayi);
        kural2(sayi2);

 */

    static int sayi2, sayi;

    static void kural1(int sayi) {
        sayi2 = sayi;
        if (sayi > 0) {
            sayi -= 5;

            System.out.print(sayi + " ");
            kural1(sayi);

        }
    }

    static void kural2(int sayi2) {

        if (sayi2 < sayi) {
            sayi2 += 5;

            System.out.print(sayi2 + " ");
            kural2(sayi2);

        }
    }
}
