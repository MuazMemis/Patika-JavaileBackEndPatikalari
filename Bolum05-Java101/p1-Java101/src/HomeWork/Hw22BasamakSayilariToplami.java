package HomeWork;

import java.util.Scanner;

public class Hw22BasamakSayilariToplami {
    public static void hesapla(){
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int number = input.nextInt();

        int basValue;
        int result = 0;

        while (number != 0) {
            basValue = number % 10;
            result+=basValue;
            number /= 10;
        }

        System.out.printf("Basamak Sayılarının Toplamı: %s", result);
    }
}
