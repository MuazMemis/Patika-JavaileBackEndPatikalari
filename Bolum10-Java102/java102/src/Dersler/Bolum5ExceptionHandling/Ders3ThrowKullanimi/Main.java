package Dersler.Bolum5ExceptionHandling.Ders3ThrowKullanimi;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yaşınızı giriniz : ");
        int age = scanner.nextInt();
        try {
            checkAge(age);
        } catch (Exception e) {
            System.out.println("Yaşı uymadı.");
            System.out.println(e.toString());
        }
        System.out.println("Program bitti.");
    }

    public static void checkAge(int age) throws IOException, ArithmeticException {
        if (age < 18) {
//            throw new ArithmeticException("Yaşınız tutmuyor");
//            throw new Exception("Yaşınız tutmuyor");
            throw new IOException("Yaşınız tutmuyor");
        }
        System.out.println("yaşı uygundur.");
    }
}
