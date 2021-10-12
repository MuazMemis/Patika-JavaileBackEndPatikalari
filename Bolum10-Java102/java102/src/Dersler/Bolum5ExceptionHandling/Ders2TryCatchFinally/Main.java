package Dersler.Bolum5ExceptionHandling.Ders2TryCatchFinally;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Program başladı!");

        Scanner scanner = new Scanner(System.in);

        int a = 1;
        int b = 10;
        int c;
        int[] arr = new int[2];

        try {
            System.out.println("Bölme işlemi.");
            System.out.println(b / a);
            System.out.println("Bölme işlemi bitti.");
            c = scanner.nextInt();
            arr[10] = 11;
        } catch (ArithmeticException e) {
            System.out.println("Aritmatik hata alındı.");
            System.out.println(e.getMessage());
        }/* catch (InputMismatchException e) {
//            System.out.println("Hata yakalandı.");
//            System.out.println(e.getMessage());
//            e.printStackTrace();
            System.out.println("Yanlış veri girişi.");
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array hatası.");
            System.out.println(e.getMessage());
        }*/ catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("bu kısım kesinlikle çalışır.");
        }

        System.out.println("Program bitti !");
    }
}
