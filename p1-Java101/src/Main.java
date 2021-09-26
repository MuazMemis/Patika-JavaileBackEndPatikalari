import HomeWork.Hw46MayinTarlasi.MineSweeper;
import HomeWork.Hw46MayinTarlasi.MineSweeper2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row, col;

        System.out.println("Mayın Tarlasına Hoşgeldiniz!");
        System.out.println("Lütfen oynamak istediğiniz boyutları giriniz.");

        System.out.print("Satır sayısı : ");
        row = scan.nextInt();

        System.out.print("Sütun sayısı : ");
        col = scan.nextInt();

        MineSweeper mine = new MineSweeper(row, col);
        mine.run();
//        MineSweeper2 mine2 = new MineSweeper2();
    }
}

