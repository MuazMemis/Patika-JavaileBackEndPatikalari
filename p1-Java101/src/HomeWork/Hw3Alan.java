package HomeWork;

import java.util.Scanner;

public class Hw3Alan {
    public static void alanHesapla() {
        int a, b, c;
        double u, alan;

        Scanner input = new Scanner(System.in);

        System.out.print("1. Kenarı giriniz: ");
        a = input.nextInt();

        System.out.print("2. Kenarı giriniz: ");
        b = input.nextInt();

        System.out.print("3. Kenarı giriniz: ");
        c = input.nextInt();

        u = (a + b + c) / 2;

        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println(alan);

    }
}
