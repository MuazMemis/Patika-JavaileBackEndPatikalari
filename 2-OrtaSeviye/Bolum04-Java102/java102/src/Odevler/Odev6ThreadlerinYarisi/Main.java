package Odevler.Odev6ThreadlerinYarisi;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Integer> odd = new ArrayList<>();
    static List<Integer> even = new ArrayList<>();

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list4 = new ArrayList<>();

        for (int i = 1; i <= 10000; i++) {
            numbers.add(i);
        }

        for (int number : numbers) {
            if (number <= 2500) {
                list1.add(number);
            } else if (number <= 5000) {
                list2.add(number);
            } else if (number <= 7500) {
                list3.add(number);
            } else {
                list4.add(number);
            }
        }

        Numbers n1 = new Numbers(list1);
        Numbers n2 = new Numbers(list2);
        Numbers n3 = new Numbers(list3);
        Numbers n4 = new Numbers(list4);

        Thread t1 = new Thread(n1);
        Thread t2 = new Thread(n2);
        Thread t3 = new Thread(n3);
        Thread t4 = new Thread(n4);

        t1.start();
        t2.start();
        t3.start();
        t4.start();


    }
}
