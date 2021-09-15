package HomeWork;

import java.util.Scanner;

public class Hw9UserLogin {
    public static void login(){
        String userName, password = "java123", password1, password2;
        String sıfırla;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adı : ");
        userName = input.nextLine();

        System.out.print("Parola : ");
        password1 = input.nextLine();

        if (userName.equals("patika") && password1.equals(password)) {
            System.out.println("Giriş yaptınız!");
        } else {
            System.out.println("Bilgileriniz Yanlış!");
            System.out.print("Parolanızı sıfırlamak ister misiniz? ");
            sıfırla = input.nextLine();

            if (sıfırla.equals("evet")) {
                System.out.print("Yeni parolayı giriniz: ");
                password2 = input.nextLine();

                if (password2.equals(password1) || password2.equals(password)) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Şifre oluşturuldu");
                }
            }
        }
    }
}
