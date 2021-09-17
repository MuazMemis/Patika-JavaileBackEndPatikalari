package HomeWork;

import java.util.Scanner;

public class Hw30TersUcgen {
    public static void yap(){
        Scanner input = new Scanner(System.in);

        System.out.print("Bir n degeri giriniz: ");
        int n = input.nextInt();

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
