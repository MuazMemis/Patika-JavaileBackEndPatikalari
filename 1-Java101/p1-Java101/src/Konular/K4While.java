package Konular;

import java.util.Scanner;

public class K4While {
    public static void donguWhile(){
        int password;
        boolean isPasswordSuccess = false;

        Scanner input = new Scanner(System.in);

        while (!isPasswordSuccess) {
            System.out.print("Şifre Giriniz : ");
            password = input.nextInt();

            if (password == 123) {
                System.out.println("Giriş yapıldı.");
                isPasswordSuccess = true;
            } else {
                System.out.println("Giriş başarısız.");
            }
        }
    }
}
