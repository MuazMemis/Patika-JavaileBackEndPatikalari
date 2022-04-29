package HomeWork;

import java.util.Scanner;

public class Hw32Fibonacci {
    public static void fibonacci(){
        Scanner input = new Scanner(System.in);
        System.out.print("Serinin eleman sayısını giriniz : ");
        int sayi = input.nextInt();

        int a = 0, b = 1, c;
        System.out.print(a + " " + b);

        for (int i = 2; i <= sayi; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}
