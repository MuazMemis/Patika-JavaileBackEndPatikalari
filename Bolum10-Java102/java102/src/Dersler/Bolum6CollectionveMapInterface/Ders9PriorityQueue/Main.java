package Dersler.Bolum6CollectionveMapInterface.Ders9PriorityQueue;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<String> q = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        }.reversed());

        q.add("Mustafa");
        q.add("Çetindağ");
        q.add("Ahmet");
        q.add("Dark");

//        for (String s : q) {
//            System.out.println(s);
//        }
//        System.out.println(q);

//        System.out.println(q.poll());
//        System.out.println(q.element());

        Iterator<String> itr = q.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
