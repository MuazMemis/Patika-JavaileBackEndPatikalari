package HomeWork;

import java.util.Scanner;

public class Hw35RecursivePrime {

/*
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Number to Check: ");
        int sayi = scan.nextInt();
        int i = 2;
        System.out.println(recursivePrime(sayi, i) ? "Asal" : "Asal Değil");
        scan.close();

 */

    static boolean recursivePrime(int x, int i) {

        if (x == i || x == 1)
            return true;
        if (x % i == 0)
            return false;
        return recursivePrime(x, i + 1);
    }
}
