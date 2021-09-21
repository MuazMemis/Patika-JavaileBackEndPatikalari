import Konular.OOP.MaasHesabı.Employee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] uzaklik = {
                {0, 453, 939, 243, 783, 891},
                {453, 0, 490, 384, 620, 439},
                {939, 490, 0, 839, 863, 423},
                {243, 384, 839, 0, 544, 823},
                {783, 620, 863, 544, 0, 1045},
                {891, 439, 423, 823, 1045, 0}
        };

        int matrix[][] = new int[3][4];
        System.out.println("Satır elemanları : " + matrix.length);
        System.out.println("Sütun elemanları : " + matrix[0].length);

        int number = 1;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = number++;
            }
        }
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }
}

