package HomeWork;

import java.util.Scanner;

public class Hw20Kombinasyon {
    public static void hesapla(){

        int n, r, totalN = 1, totalR = 1, totalNR = 1;
        double kombinasyon;
        Scanner input = new Scanner(System.in);

        System.out.print("n sayısını giriniz: ");
        n = input.nextInt();

        System.out.print("r sayısını giriniz: ");
        r = input.nextInt();

        for (int i = 1; i <= n; i++) {
            totalN *= i;
        }

        for (int j = 1; j <= r; j++) {
            totalR *= j;
        }

        for (int k = 1; k <= n - r; k++) {
            totalNR *= k;
        }

        kombinasyon = totalN / (totalR * totalNR);
        System.out.println(kombinasyon);
    }
}
