package HackerRank;

import java.util.Scanner;

public class Hr3JavaLoops1 {
    public static void javaLoops1(){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(N + " x " + i + " = " + N * i);
        }
    }
}
