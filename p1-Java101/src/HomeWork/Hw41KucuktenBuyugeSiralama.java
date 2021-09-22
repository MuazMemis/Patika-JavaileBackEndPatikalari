package HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class Hw41KucuktenBuyugeSiralama {
    public static void sirala(){
        Scanner scan = new Scanner(System.in);

        System.out.print("Dizinin boyutu n : ");
        int n = scan.nextInt();
        int[] numbers = new int[n];
        int tempValue;

        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". Elemanı : ");
            numbers[i] = scan.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (numbers[j] < numbers[i]) {
                    tempValue = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = tempValue;
                }
            }
        }

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

//        System.out.print("Sıralama: ");
//        for (int value : numbers) {
//            System.out.printf("%s, ", value);
//        }
//        System.out.print("\b\b");
    }
}
