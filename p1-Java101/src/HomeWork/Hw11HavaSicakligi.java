package HomeWork;

import java.util.Scanner;

public class Hw11HavaSicakligi {
    public static void etkinlikOner() {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.println("Sıcaklık giriniz: ");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.println("Kayak yapabilirsin.");
        } else if (heat > 5 && heat < 10) {
            System.out.println("Sinemaya gidebilirsin.");
        } else if (heat > 10 && heat < 15) {
            System.out.println("Sinemaya gidebilirsin.");
            System.out.println("Pikniğe gidebilirsin.");
        } else if (heat > 15 && heat < 25) {
            System.out.println("Pikniğe gidebilirsin.");
        } else {
            System.out.println("Yüzmeye gidebilirsin.");
        }
    }
}
