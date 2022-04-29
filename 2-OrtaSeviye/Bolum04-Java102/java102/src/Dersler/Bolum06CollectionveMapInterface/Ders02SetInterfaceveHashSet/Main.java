package Dersler.Bolum06CollectionveMapInterface.Ders02SetInterfaceveHashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> hSet = new HashSet<>();
        hSet.add(10); // Tekrar eden sayıları hafıza da tutmaz.
        hSet.add(20);
        hSet.add(10);
        hSet.add(30);
        hSet.add(5);
        hSet.add(2);
        hSet.add(null);

//        System.out.println(hSet.size());
//        System.out.println(hSet.isEmpty());
//        System.out.println(hSet.contains(1));
        hSet.remove(10);
//        hSet.clear();
        for (Integer sayi : hSet) {
//            System.out.println(sayi);
        }

        Iterator<Integer> iterator = hSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
