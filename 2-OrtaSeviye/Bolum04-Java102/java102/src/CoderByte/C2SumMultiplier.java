package CoderByte;

import java.util.Arrays;

public class C2SumMultiplier {
    public static boolean SumMultiplier(int[] arr) {
        int total = 0;
        for (int a : arr) {
            total += a;
        }

        int max1 = Arrays.stream(arr).max().getAsInt();
        int max2 = 0;

        for (int number : arr) {
            if (number > max2) {
                if (number == max1) {

                } else {
                    max2 = number;
                }
            }
        }

        return (max1 * max2) > total;
    }

    public static void main(String[] args) {
        SumMultiplier(new int[]{2, 5, 2, 2, 4, 1});
    }
}

/*class Main {

    public static boolean SumMultiplier(int[] arr) {
        int total = 0;
        for (int a : arr) {
            total += a;
        }
        int max1 = Arrays.stream(arr).max().getAsInt();
        int max2 = 0;

        for (int number : arr) {
            if (number > max2) {
                if (number == max1) {

                } else {
                    max2 = number;
                }
            }
        }

        return (max1 * max2) > total;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(SumMultiplier(s.nextLine()));
    }

}*/
