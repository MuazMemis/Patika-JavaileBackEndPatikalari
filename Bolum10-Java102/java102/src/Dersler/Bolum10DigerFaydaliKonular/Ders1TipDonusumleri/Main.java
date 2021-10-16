package Dersler.Bolum10DigerFaydaliKonular.Ders1TipDonusumleri;

public class Main {
    public static void main(String[] args) {
        /**
         Widening Casting (Otomatik)
         Küçük veri tipini daha büyük veri tipine dönüştürme işlemine denir.
         byte -> short -> char -> int -> long -> float -> double
         */

        int myInt = 3;
        double myDouble = myInt; // Otomatik Dönüştürme : int => double
        System.out.println(myInt);      // Çıktısı 3
        System.out.println(myDouble);   // Çıktısı 3.0

        double piDouble = 3.14;
        int piInt = (int) piDouble;
        System.out.println(piInt);

        int a = 20;
        System.out.println("Int : " + a);

        String str = String.valueOf(a);
        System.out.println("String : " + str);

        Integer integer = Integer.parseInt(str);
        System.out.println("Integer : " + (integer + a));

    }
}
