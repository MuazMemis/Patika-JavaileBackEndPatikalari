package CoderByte;

import java.util.Arrays;
import java.util.Scanner;

public class C1NumberReverse {
    public static String NumberReverse(String str) {
        String[] arrOfStr = str.split(" ", 3);
        String arr2 = "";
        for (int i = arrOfStr.length - 1; i >= 0; i--)
            arr2 += arrOfStr[i] + " ";
        System.out.println(arr2);
        return arr2;
    }

    public static void main(String[] args) {
        NumberReverse("10 20 50");

    }
}

/*
class Main {

    public static String NumberReverse(String str) {
        String[] arrOfStr = str.split(" ", 3);
        String arr2 = "";
        for (int i = arrOfStr.length - 1; i >= 0; i--)
            arr2 += arrOfStr[i] + " ";
        return arr2;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(NumberReverse(s.nextLine()));
    }

}*/
