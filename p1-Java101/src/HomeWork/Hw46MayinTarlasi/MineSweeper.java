package HomeWork.Hw46MayinTarlasi;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int rowNumber, colNumber, size, mineCount;
    int[][] map;
    int[][] board;
    boolean game = true;

    Random random = new Random();
    Scanner scan = new Scanner(System.in);

    public MineSweeper(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.map = new int[rowNumber][colNumber];
        this.board = new int[rowNumber][colNumber];
        this.size = rowNumber * colNumber;
        this.mineCount = size / 4;
    }

    public void run() {
        int row, col, success = 0;
        int mineWithoutCount = this.size - this.mineCount;

        prepareGame();
        System.out.println("Map");
        print(this.map);
        System.out.println("=============");

        System.out.println("Oyun başladı.");
        while (this.game) {
            System.out.println("Mayın Tarlası");
            print(this.board);
            System.out.println("=============");
            System.out.print("Satır : ");
            row = scan.nextInt();
            System.out.print("Sütuns : ");
            col = scan.nextInt();

            if (isCoordinate(row, col)) continue;

            if (this.map[row][col] != -1) {
                check(row, col);
                success++;

                if (success == (mineWithoutCount)) {
                    System.out.println("Başardınız!");
                    break;
                }
            } else {
                this.game = false;
                System.out.println("Game Over!");
            }
        }
    }

    private boolean isCoordinate(int row, int col) {
        if (row < 0 || row >= this.rowNumber || col < 0 || col >= this.colNumber) {
            System.out.println("Geçersiz koordinat.");
            return true;
        }
        return false;
    }

    private void check(int row, int col) {
        if (this.map[row][col] == 0) {
            if ((col < this.colNumber - 1) && (this.map[row][col + 1] == -1)) {
                this.board[row][col]++;
            }
            if ((col > 0) && (this.map[row][col - 1] == -1)) {
                this.board[row][col]++;
            }
            if ((row < this.rowNumber - 1) && (this.map[row + 1][col] == -1)) {
                this.board[row][col]++;
            }
            if ((row > 0) && (this.map[row - 1][col] == -1)) {
                this.board[row][col]++;
            }
            if (this.board[row][col] == 0) {
                this.board[row][col] = -2;
            }
        }
    }

    private void prepareGame() {
        int randRow, randCol, count = 0;

        while (count != (this.mineCount)) {
            randRow = this.random.nextInt(this.rowNumber);
            randCol = this.random.nextInt(this.colNumber);

            if (this.map[randRow][randCol] != -1) {
                this.map[randRow][randCol] = -1;
                count++;
            }
        }
    }

    private void print(int[][] arr) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                if (arr[row][col] >= 0) {
                    System.out.print(" " + arr[row][col] + " ");
                } else {
                    System.out.print(arr[row][col] + " ");
                }
            }
            System.out.println();
        }
    }
}
