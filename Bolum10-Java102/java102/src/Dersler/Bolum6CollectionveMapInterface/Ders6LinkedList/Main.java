package Dersler.Bolum6CollectionveMapInterface.Ders6LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> liste = new LinkedList<>();
        liste.add("Mustafa");
        liste.add("Çetindağ");
        liste.add("Mustafa");
        liste.add("Java 102");
        liste.add("Patika");

//        liste.remove("Mustafa"); // bulduğu ilk değeri siler.
        liste.remove(2); // 2. indeksi siler.

        Iterator<String> itr = liste.iterator();

//        while (itr.hasNext()) {
//            System.out.println(itr.next());
//        }

        for (String s : liste) {
            System.out.println(s);
        }
    }
}
