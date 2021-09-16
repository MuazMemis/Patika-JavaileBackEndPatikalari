package Konular;

import java.util.Scanner;

public class K5DoWhile {
    public static void doWhile() {
        Scanner input = new Scanner(System.in);

        int password;
        boolean askPassword = true;

        do {
            System.out.print("Şifre Giriniz: ");
            password = input.nextInt();
            if (password == 123) {
                System.out.println("Doğru");
                askPassword = false;
            } else {
                System.out.println("Yanlış");
            }
        } while (askPassword);
    }
}
