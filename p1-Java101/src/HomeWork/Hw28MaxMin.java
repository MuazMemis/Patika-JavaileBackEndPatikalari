package HomeWork;

import java.util.Scanner;

public class Hw28MaxMin {
    public static void hesapla(){

        Scanner input = new Scanner(System.in);
        int n, max = 0, min = 0;

        System.out.print("Kaç tane sayı gireceksiniz: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". Sayıyı giriniz: ");
            int number = input.nextInt();

            if (i == 1) {
                min = number;
            }

            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }

        System.out.println("Max :" + max + "\nMin :" + min);
        System.out.println();
    }
}
