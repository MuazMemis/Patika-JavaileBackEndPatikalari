package HomeWork;

import java.util.Scanner;

public class Hw34RecursiveUsluSayilar {

/*
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz : ");
        int base = scan.nextInt();
        System.out.print("Üs değerini giriniz : ");
        int exponent = scan.nextInt();
        System.out.println(pow(base, exponent));

 */

    static int pow(int base, int exponent) {
        if (base == 1)
            return 1;
        else if (exponent == 0)
            return 1;
        else
            return base * pow(base, exponent - 1);
    }
}
