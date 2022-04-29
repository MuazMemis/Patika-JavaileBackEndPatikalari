package Dersler.Bolum05ExceptionHandling.Ders4OzelException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws AgeCheckException {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Yaşınızı giriniz : ");
        int age = scanner.nextInt();
        try {
            checkAge(age);
        } catch (AgeCheckException e) {
            System.out.println(e.toString());
        }
        System.out.println("Program bitti.");
    }

    public static void checkAge(int age) throws AgeCheckException {
        if (age < 18) {
            throw new AgeCheckException("Yaş hatası");
        }

        System.out.println("yaşı uygundur.");
    }
}
