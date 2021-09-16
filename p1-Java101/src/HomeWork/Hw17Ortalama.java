package HomeWork;

import java.util.Scanner;

public class Hw17Ortalama {
    public static void hesapla(){

        Scanner input = new Scanner(System.in);
        int sayi;

        System.out.print("Bir sayı giriniz : ");
        sayi = input.nextInt();
        int uceBolunen = 0, dordeBolunen = 0, ortalamaBolumSayisi = 0;
        double result;

        for (int i = 1; i <= sayi; i++) {
            if (i % 3 == 0) {
                uceBolunen += i;
                ortalamaBolumSayisi++;
            } else if (i % 4 == 0) {
                dordeBolunen += i;
                ortalamaBolumSayisi++;
            }
        }
        int toplam = uceBolunen + dordeBolunen;
        result = toplam / ortalamaBolumSayisi;
        System.out.println(result);
    }
}
