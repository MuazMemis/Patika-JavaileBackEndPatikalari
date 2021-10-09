package HomeWork;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Hw44SayiTahminiOyunu {
    public static void game() {
        int number = (int) (Math.random() * 100);
        System.out.println(number);

        Random random = new Random();
        number = random.nextInt(100);
        System.out.println(number);

        Scanner scanner = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        while (right < 5) {
            System.out.print("Lütfen tahmininizi giriniz : ");
            selected = scanner.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Lütfen 0-100 arasında değer giriniz.");
                if (!isWrong) {
                    isWrong = true;
                    System.out.println("Hatalı girişinizde hakkınızdan düşülecektir.");
                } else {
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hakkınız : " + (5 - (++right)));
                }
                continue;
            }

            if (selected == number) {
                System.out.println("Tebrikler!");
                isWin = true;
                break;
            } else {
                wrong[right++] = selected;
                System.out.println("Hatalı sayı.");

                if (selected > number) {
                    System.out.println(selected + " sayısı gizli sayıdan büyüktür.");
                } else {
                    System.out.println(selected + " sayısı gizli sayıdan küçüktür.");
                }

                System.out.println("Kalan hakkı : " + (5 - right));
            }
        }

        if (!isWin) {
            System.out.println("Kaybettiniz.");
            if (!isWrong)
                System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
        }
    }
}
