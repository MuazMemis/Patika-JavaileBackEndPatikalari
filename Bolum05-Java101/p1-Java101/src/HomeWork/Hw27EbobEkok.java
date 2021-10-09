package HomeWork;

import java.util.Scanner;

public class Hw27EbobEkok {
    public static void hesapla(){
        Scanner input = new Scanner(System.in);

        int n1, n2;
        int ebob = 1;
        int ekok = 1;

        System.out.print("n1 sayısını giriniz: ");
        n1 = input.nextInt();

        System.out.print("n2 sayısını giriniz: ");
        n2 = input.nextInt();

        if (n1 < n2) {
            for (int i = n1; i >= 1; i--) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                    break;
                }
            }
            System.out.println("Ebob: " + ebob);
        } else {
            for (int i = n2; i >= 1; i--) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                    break;
                }
            }
            System.out.println("Ebob: " + ebob);
        }

        for (int i = 1; i < n1 * n2; i++) {
            if (i % n1 == 0 && i % n2 == 0) {
                ekok = i;
                break;
            }
        }
        System.out.println("Ekok: " + ekok);
    }
}
