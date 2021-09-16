package HackerRank;

import java.util.Scanner;

public class Hr2IfElse {
    public static void ifElse(){
        int value;
        Scanner input=new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        value=input.nextInt();

        if (value%2==0){
            if (value>=2&&value<=5){
                System.out.println("Not Weird");
            }else if (value>=6&&value<=20){
                System.out.println("Weird");
            }else {
                System.out.println("Not Weird");
            }
        }else {
            System.out.println("Weird");
        }
    }
}
