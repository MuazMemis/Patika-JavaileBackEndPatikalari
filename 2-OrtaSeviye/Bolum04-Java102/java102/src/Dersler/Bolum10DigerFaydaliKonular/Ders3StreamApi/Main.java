package Dersler.Bolum10DigerFaydaliKonular.Ders3StreamApi;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(25);
        list.add(12);
        list.add(3);
        list.add(89);
        list.add(89);
        list.add(25);
        list.add(44);
        list.add(100);
        list.add(7);
        list.add(63);

        /*for (int i : list) {
            System.out.println(i);
        }*/

//        list.stream().forEach(i -> System.out.println(i));
//        list.forEach(i -> System.out.println(i));
//        list.stream().filter(i -> i > 60).forEach(i -> System.out.println(i));
//        list.stream().filter(i -> i > 60).forEach(num -> System.out.println(num));
//        list.stream().distinct().forEach(i -> System.out.println(i));
//        list.stream().distinct().sorted().forEach(i -> System.out.println(i));
//        list.stream().distinct().sorted(Comparator.reverseOrder()).forEach(i -> System.out.println(i));
//        list.stream().limit(5).forEach(i -> System.out.println(i));
//        list.stream().skip(3).limit(5).forEach(i -> System.out.println(i));
//        System.out.println(list.stream().skip(3).limit(5).count());
//        System.out.println(list.stream().anyMatch(i -> i == 1));
//        System.out.println(list.stream().allMatch(i -> i > 1)); // hepsinin 1 den büyük olması
//        System.out.println(list.stream().noneMatch(i -> i < 0)); // hepsinin o dan küçük olmaması
        list.stream().map(i -> Math.pow(i, 2)).forEach(i -> System.out.println(i));


    }

}
