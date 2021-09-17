package HomeWork;

import java.util.Scanner;

public class Hw25Atm {
    public static void atm() {
        Scanner input = new Scanner(System.in);

        String userName, password;
        int right = 3;
        int balance = 1500;
        int select;

        while (right > 0) {
            System.out.print("Kullanıcı adınız : ");
            userName = input.nextLine();

            System.out.print("Parolanız : ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("123")) {
                System.out.println("Merhaba X Bankasına hoşgeldiniz!");
                do {
                    System.out.println("1-Para Yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgulama\n" +
                            "4-Çıkış Yap\n");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    select = input.nextInt();
                    if (select == 1) {
                        System.out.print("Yatırılacak para miktarı : ");
                        int price = input.nextInt();
                        balance += price;
                        System.out.println("Bakiye : " + balance);
                    } else if (select == 2) {
                        System.out.print("Çekilecek para miktarı : ");
                        int price = input.nextInt();
                        if (price > balance) {
                            System.out.println("Bakiye yetersiz.");
                        } else {
                            balance -= price;
                            System.out.println("Bakiye : " + balance);
                        }
                    } else if (select == 3) {
                        System.out.println("Bakiye : " + balance);
                    }
                } while (select != 4);
                System.out.println("Tekrar görüşmek üzere.");
                break;
            } else {
                right--;
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kullanıcı adı veya parola yanlış. Tekrar deneyiniz");
                    System.out.println("Kalan hakkınız " + right);
                }
            }
        }
    }
}
