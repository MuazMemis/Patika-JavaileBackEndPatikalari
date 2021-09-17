package HomeWork;

import java.util.Scanner;

public class Hw29MukemmelSayi {
    public static void hesapla(){
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = input.nextInt();
        int total = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }
        }

        if (total == number) {
            System.out.println(number + " mükemmel sayıdır.");
        } else {
            System.out.println(number + " mükemmel sayı değildir.");
        }
    }
}
