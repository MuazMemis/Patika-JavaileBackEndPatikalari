package Dersler.Bolum2NesneYonelimliProgramlama.Ders7Interface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tutar giriniz : ");
        double price = scanner.nextDouble();

        scanner.nextLine();
        System.out.print("Kart No giriniz : ");
        String cardNumber = scanner.nextLine();

        System.out.print("Son kullanım tarihini giriniz : ");
        String date = scanner.nextLine();

        System.out.print("Güvenlik kodunu giriniz : ");
        String cvc = scanner.nextLine();

        System.out.println("1. A Bankası");
        System.out.println("2. B Bankası");
        System.out.println("3. C Bankası");
        System.out.print("Banka seçiniz : ");
        int selectBank = scanner.nextInt();

        switch (selectBank) {
            case 1:
                ABankasi aPos = new ABankasi("A Bankası", "549851485251", "461651");
                aPos.connect("127.0.0.3");
                aPos.payment(price, cardNumber, date, cvc);
                break;
            case 2:
                BBankasi bPos = new BBankasi("B Bankası", "549851485251", "461651");
                bPos.connect("127.0.0.3");
                bPos.payment(price, cardNumber, date, cvc);
                break;
            case 3:

                break;
            default:
                System.out.println("Geçerli banka giriniz ! ");
        }
    }
}
