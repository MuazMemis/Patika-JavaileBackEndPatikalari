package HomeWork;

import java.util.Scanner;

public class Hw24Elmas {
    public static void elmas() {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir n degeri giriniz:");
        int n = input.nextInt();

        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int c = 1;
        for (int i = n - 2; i >= 0; i--) {
            for (int k = 0; k <= c; k++) {
                System.out.print(" ");
            }
            for (int j = 2 * i - 1; j > 0; j--) {
                System.out.print("*");
            }

            System.out.println();
            c++;
        }
    }
}
