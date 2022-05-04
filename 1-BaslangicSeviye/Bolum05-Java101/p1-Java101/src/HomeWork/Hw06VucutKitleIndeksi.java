package HomeWork;

import java.util.Scanner;

public class Hw06VucutKitleIndeksi {
    public void hesapla(){
        double boy, kilo, indeks;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = input.nextDouble();

        indeks = kilo / (boy * boy);

        System.out.println("Vücut Kitle İndeksiniz : " + indeks);
    }
}
