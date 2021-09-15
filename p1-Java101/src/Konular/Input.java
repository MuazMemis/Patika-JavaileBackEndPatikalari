package Konular;

import java.util.Scanner;

public class Input {
    public void UserInput(){

        /**
         * @outhor Muaz MEMİŞ, 2021
         *
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Bir değer giriniz: ");

        int a=input.nextInt();
        System.out.println("Sayı = " + a);

        Scanner inputString = new Scanner(System.in);
        System.out.print("Bir değer giriniz: ");

        String str =input.nextLine();
        System.out.println(str);
    }
}
