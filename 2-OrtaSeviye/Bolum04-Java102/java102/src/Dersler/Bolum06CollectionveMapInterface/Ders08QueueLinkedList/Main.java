package Dersler.Bolum06CollectionveMapInterface.Ders08QueueLinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.add("Mustafa");
        q.add("Çetindağ");
        q.add("Çetindağ");
        q.add("Ali");
        q.offer("Patika");
//        q.remove("Ali");
//        q.remove(2); // çalışmaz.
//        System.out.println(q.remove("Ali"));
//        System.out.println(q.element()); // kuyruğun başındaki öğeyi verir.
        System.out.println(q.poll()); // ilk öğeyi çıkartır.
        System.out.println(q.peek()); // kuyruğun başındaki öğeyi verir. Kuyruktan atmaz

        System.out.println("--------------");
        Iterator<String> itr = q.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
