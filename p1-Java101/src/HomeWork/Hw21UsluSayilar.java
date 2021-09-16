package HomeWork;

import java.util.Scanner;

public class Hw21UsluSayilar {
    public static void hesapla(){
        int n, k, total = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("n sayısını giriniz: ");
        n = input.nextInt();

        System.out.print("k sayısını giriniz: ");
        k = input.nextInt();

        for (int i = 1; i <= k; i++) {
            total *= n;
        }

        System.out.println(total);
    }
}
