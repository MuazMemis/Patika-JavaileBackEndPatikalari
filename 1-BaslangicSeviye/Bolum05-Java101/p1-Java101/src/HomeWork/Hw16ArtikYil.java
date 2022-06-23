package HomeWork;

import java.util.Scanner;

public class Hw16ArtikYil {
    public static void hesapla(){
        int yil;

        Scanner input = new Scanner(System.in);
        System.out.print("Yıl Giriniz : ");
        yil = input.nextInt();

        if (yil % 4 == 0) {
            if (yil % 100 == 0) {
                if (yil % 400 == 0){
                    System.out.println(yil + " bir artık yıldır !");
                }else {
                    System.out.println(yil + " bir artık yıl değildir !");
                }
            }
            else {
                System.out.println(yil + " bir artık yıldır !");
            }
        }else {
            System.out.println(yil + " bir artık yıl değildir !");
        }
    }
}
