package HomeWork.Hw46MayinTarlasi;

import java.util.Random;

public class MineSweeper2 {
    int rowNumber;
    int colNumber;

    public MineSweeper2(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
    }

    public void run() {
        String[][] matris = new String[this.rowNumber][this.colNumber];
        int yildiz = this.rowNumber * this.colNumber / 4;
        int sayac = 0;
        boolean yildizBasma = false;

        Random rand = new Random();
        int yildizColNumber = 0;
        int yildizRowNumber = 0;

        for (int i = 0; i < matris.length; i++) {

            if (yildizBasma) {
                yildizRowNumber = rand.nextInt(this.rowNumber);
                yildizColNumber = rand.nextInt(this.colNumber);
            }

            for (int j = 0; j < matris[i].length; j++) {
//                System.out.println("row : " + yildizRowNumber + " i :" + i);
//                System.out.println("col : " + yildizColNumber + " j :" + j);

                if ((i == yildizRowNumber) && (j == yildizColNumber)) {
                    if (sayac <= yildiz) {
                        System.out.print("* ");
                        yildizBasma = true;
                        sayac++;
                    }
                } else {
                    System.out.print("- ");
                }

            }
            System.out.println();
        }
    }
}
