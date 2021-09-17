package HomeWork;

import java.util.Scanner;

public class Hw23Harmonik {
    public static void hesapla(){
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int n = input.nextInt();
        double result = 0.0;

        for (double i = 1; i <= n; i++) {
            result += (1 / i);
        }

        System.out.println(result);
    }
}
