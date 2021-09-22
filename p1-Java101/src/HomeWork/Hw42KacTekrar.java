package HomeWork;

import java.util.Arrays;

public class Hw42KacTekrar {
    public static void bul() {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};

        System.out.println("Dizi : " + Arrays.toString(list));
        System.out.println("Tekrar Sayıları");
        for (int i = 0; i < list.length; i++) {
            int duplicateIndex = 0;
            for (int j = 0; j < list.length; j++) {
                if (list[i] == list[j]) {
                    for (int k = 0; k < i; k++) {
                        if (list[k] == list[i]) {
                            duplicateIndex = -1;
                        }
                    }
                    duplicateIndex++;
                }
            }

            if (duplicateIndex != 0) {
                if (duplicateIndex != 1)
                    System.out.printf("%s sayısı %s kere tekrar edildi.\n", list[i], duplicateIndex);
            }
        }
    }
}
