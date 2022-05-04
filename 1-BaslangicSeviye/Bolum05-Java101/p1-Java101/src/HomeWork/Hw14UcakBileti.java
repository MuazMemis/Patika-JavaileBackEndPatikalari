package HomeWork;

import java.util.Scanner;

public class Hw14UcakBileti {
    public static void ticketPrice(){
        int km, yas, yolculukTipi;
        double perKm = 0.1, normalTutar, indirimliTutar, result;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        km = input.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        yas = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        yolculukTipi = input.nextInt();

        normalTutar = km * perKm;

        if (km > 0 && yas > 0 && (yolculukTipi > 0 && yolculukTipi < 3)) {
            if (yas < 12) {
                indirimliTutar = normalTutar * 0.5;
                if (yolculukTipi == 2) {
                    result = indirimliTutar * 2 * 0.8;
                } else {
                    result = indirimliTutar;
                }
            } else if (yas < 24) {
                indirimliTutar = normalTutar * 0.9;
                if (yolculukTipi == 2) {
                    result = indirimliTutar * 2 * 0.8;
                } else {
                    result = indirimliTutar;
                }
            } else if (yas > 65) {
                indirimliTutar = normalTutar * 0.7;
                if (yolculukTipi == 2) {
                    result = indirimliTutar * 2 * 0.8;
                } else {
                    result = indirimliTutar;
                }
            } else {
                result = normalTutar;
            }

            System.out.println("Toplam Tutar: " + result);
        } else {
            System.out.println("Hatalı Veri Girdiniz !");
        }
    }
}
