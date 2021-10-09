package HomeWork;

import java.util.Scanner;

public class Hw19BirSayininKuvvetleri {
    public static void hesapla(){
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        n = input.nextInt();

        for (int i = 1; i < n; i*=4) {
            if (i==1){
                continue;
            }
            System.out.println(i);
        }
        for (int j = 1; j < n; j*=5) {
            if (j==1){
                continue;
            }
            System.out.println(j);
        }
    }
}
