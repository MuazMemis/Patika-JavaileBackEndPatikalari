package HomeWork;

public class Hw43MatrisTranspose {
    public static void matris(){
        int[][] matris2 = new int[3][2];

        int[][] matris1 = {
                {1, 2, 3},  //0,0 0,1 0,2
                {4, 5, 6}   //1,0 1,1 1,2
        };

        for (int i = 0; i < matris1.length; i++) {
            for (int j = 0; j < matris1[i].length; j++) {
                matris2[j][i] = matris1[i][j];
            }
        }

        for (int i = 0; i < matris2.length; i++) {
            for (int j = 0; j < matris2[i].length; j++) {
                System.out.print(matris2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
