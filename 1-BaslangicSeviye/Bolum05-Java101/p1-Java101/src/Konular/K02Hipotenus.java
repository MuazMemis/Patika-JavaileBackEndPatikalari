package Konular;

import java.util.Scanner;

public class K02Hipotenus {
    public void hipotenus(){
        int a, b;
        double c;

        Scanner input = new Scanner(System.in);

        System.out.print("1. Kenarı giriniz: ");
        a = input.nextInt();

        System.out.print("2. Kenarı giriniz: ");
        b = input.nextInt();

        c = Math.sqrt((a * a) + (b * b));
        System.out.println(c);
    }
}
