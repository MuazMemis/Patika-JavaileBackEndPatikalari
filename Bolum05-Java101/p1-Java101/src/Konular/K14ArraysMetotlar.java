package Konular;

import java.util.Arrays;

public class K14ArraysMetotlar {
    public static void arraysMetotlar() {
        // Arrays.toString()
        /*int[] dizi = {3, 5, 79, 12, 25, -3, 66, 82, -49, 152};
        System.out.println(Arrays.toString(dizi));*/

        // Arrays.fill()
        /*int[] liste = {15, 1, 99, 7, 7, -22, 11, 2, -49, 52};
        Arrays.fill(liste, 2);
        System.out.println(Arrays.toString(liste));
        int[] liste2 = {15, 1, 99, 7, 7, -22, 11, 2, -49, 52};
        Arrays.fill(liste2, 3, 5, 7);
        System.out.println(Arrays.toString(liste2));*/

        // Arrays.sort()
        /*int[] liste = {6, 1, 55, 21, 33, -321, -21, 2, -11, 27};
        Arrays.sort(liste);
        System.out.println(Arrays.toString(liste));*/

        // Arrays.binarySearch()
        /*int[] liste = {6, 1, 55, 21, 33, -321, -21, 2, -11, 27};
        Arrays.sort(liste);
        System.out.println(Arrays.toString(liste));
        int index = Arrays.binarySearch(liste, 33);
        System.out.println("33'ün indeksi :" + index);*/

        // Arrays.copyOf() ve Arrays.copyOfRange() metotu
        /*int[] liste = {6, 1, 55, 21, 33, -321, -21, 2, -11, 27};
        int[] copyArray = Arrays.copyOf(liste, 3);
        System.out.println(Arrays.toString(copyArray));
        int[] copyOfRangeArray = Arrays.copyOfRange(liste, 0,5);
        System.out.println(Arrays.toString(copyOfRangeArray));*/

        // Arrays.equals() metotu
        int[] list1 = {1, 2, 3};
        int[] list2 = {1, 2, 3};
        int[] list3 = {1, 2, 10};
        System.out.println(Arrays.equals(list1, list2)); // true
        System.out.println(Arrays.equals(list2, list3)); // false
    }
}
