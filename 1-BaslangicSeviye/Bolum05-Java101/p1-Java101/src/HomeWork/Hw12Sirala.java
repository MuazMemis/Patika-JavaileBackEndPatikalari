package HomeWork;

import java.util.Scanner;

public class Hw12Sirala {
    public static void sirala(){
        int a,b,c;

        Scanner input = new Scanner(System.in);

        System.out.print("1. sayıyı girimiz: ");
        a=input.nextInt();

        System.out.print("2. sayıyı girimiz: ");
        b=input.nextInt();

        System.out.print("3. sayıyı girimiz: ");
        c=input.nextInt();

        if ((a>b) && (a>c)){
            if (b>c){
                System.out.println("c<b<a");
            }else {
                System.out.println("b<c<a");
            }
        }else if ((b>a)&&(b>c)){
            if (a>c){
                System.out.println("c<a<b");
            }else {
                System.out.println("a<c<b");
            }
        }else {
            if (a>b){
                System.out.println("b<a<c");
            }else {
                System.out.println("a<b<c");
            }
        }
    }
}
