package HomeWork;

import java.util.Scanner;

public class Hw18Dordebolunen {
    public static void hesapla(){
        int n, total = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 4 == 0) {
                total += i;
            }
        }
        System.out.println(total);
    }
}
