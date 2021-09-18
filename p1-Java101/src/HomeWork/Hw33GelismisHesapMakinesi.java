package HomeWork;

import java.util.Scanner;

public class Hw33GelismisHesapMakinesi {
    /*
    Scanner scan = new Scanner(System.in);
    int select;

    String menu = "1- Toplama İşlemi\n"
            + "2- Çıkarma İşlemi\n"
            + "3- Çarpma İşlemi\n"
            + "4- Bölme işlemi\n"
            + "5- Üslü Sayı Hesaplama\n"
            + "6- Faktoriyel Hesaplama\n"
            + "7- Mod Alma\n"
            + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
            + "0- Çıkış Yap";

        System.out.println(menu);

        while (true) {
        System.out.print("Bir işlem seçiniz : ");
        select = scan.nextInt();

        if (select == 0) {
            System.out.println("Çıkış yapıldı.");
            break;
        }

        System.out.print("1. sayıyı giriniz : ");
        int a = scan.nextInt();
        System.out.print("2. sayıyı giriniz : ");
        int b = scan.nextInt();

        switch (select) {
            case 1:
                sum(a, b);
                break;
            case 2:
                minus(a, b);
                break;
            case 3:
                times(a, b);
                break;
            case 4:
                divided(a, b);
                break;
            case 5:
                pow(a, b);
                break;
            case 6:
                factorial(a);
                break;
            case 7:
                mod(a, b);
                break;
            case 8:
                calculate(a, b);
                break;
            default:
                System.out.println("Geçersiz işlem girdiniz!");
        }
    }
     */

    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("Toplam : " + result);
        return result;
    }

    static int minus(int a, int b) {
        int result = a - b;
        System.out.println("Çıkarma : " + result);
        return result;
    }

    static int times(int a, int b) {
        int result = a * b;
        System.out.println("Çarpma : " + result);
        return result;
    }

    static int divided(int a, int b) {
        if (b == 0) {
            System.out.println("İkinci sayı 0'dan farklı olmalıdır.");
            return 0;
        }
        int result = a / b;
        System.out.println("Bölme : " + result);
        return result;
    }

    static int pow(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        System.out.println("Üs hesabı : " + result);
        return result;
    }

    static void factorial(int a) {
        int result = 1;

        for (int i = 1; i <= a; i++) {
            result *= i;
        }

        System.out.println("Sonuç : " + result);
    }

    static int mod(int a, int b) {
        int result = a % b;
        System.out.println("Mod hesabı : " + result);
        return result;
    }

    static void calculate(int a, int b) {
        int alan = a * b;
        int cevre = 2 * (a + b);
        System.out.println("Alan : " + alan);
        System.out.println("Çevre : " + cevre);
    }

}
