package HomeWork;

import java.util.Scanner;

public class Hw7ManavKasa {
    public void hesapla(){
        double armutFiy = 2.14, elmaFiy = 3.67, domatesFiy = 1.11, muzFiy = 0.95, patlicanFiy = 5;
        int armutKg, elmaKg, domatesKg, muzKg, patlicanKg;
        double toplamTutar;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo : ");
        armutKg = input.nextInt();

        System.out.print("Elma Kaç Kilo : ");
        elmaKg = input.nextInt();

        System.out.print("Domates Kaç Kilo : ");
        domatesKg = input.nextInt();

        System.out.print("Muz Kaç Kilo : ");
        muzKg = input.nextInt();

        System.out.print("Patlıcan Kaç Kilo : ");
        patlicanKg = input.nextInt();

        toplamTutar = (armutFiy * armutKg) + (elmaFiy * elmaKg) + (domatesFiy * domatesKg) + (muzFiy * muzKg) + (patlicanFiy * patlicanKg);
        System.out.println("Toplam Tutar : " + toplamTutar);
    }
}
