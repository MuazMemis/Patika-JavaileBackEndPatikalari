package Dersler.Bolum06CollectionveMapInterface.Ders05ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> liste = new ArrayList<>();
        liste.add(10);
        liste.add(1);
        liste.add(null);
        liste.add(4);
        liste.add(6);
//        System.out.println(liste);

//        Iterator<Integer> itr = liste.iterator();
//        while (itr.hasNext()) {
//            System.out.println(itr.next());
//        }
//
//        for (Integer sayi : liste) {
//            System.out.println(sayi);
//        }

//        System.out.println(liste.size());
//        System.out.println(liste.get(100));
//        System.out.println(liste.indexOf(4)); // aranan değerin kaçıncı indiste oldupunu gösterir.
//        System.out.println(liste.indexOf(null)); // aranan değerin sondan kaçıncı indiste oldupunu gösterir.
//        System.out.println(liste.indexOf(100)); // -1 değeri verirse aranan değer listede yoktur.

//        liste.add(2, 1500); // 2. indise 1500 ü ekler. 2. indis 3. indise kayar...
//        System.out.println(liste.get(2));
//        liste.set(2, 150);
//        System.out.println(liste.contains(150)); // listenin içinde aranan değer varsa true döner.

//        System.out.println(liste.remove(0));
//        System.out.println("===================");
//
//        for (Integer sayi : liste) {
//            System.out.println(sayi);
//        }

        List<String> liste2 = new ArrayList<>();
        liste2.add("Ankara");
        liste2.add("İstanbul");
        liste2.add("İzmir");
        liste2.add("Bolu");
        liste2.add("Adana");
        liste2.add("Trabzon");

//        System.out.println(liste2.remove(0));
//        System.out.println("===================");
//
//        for (String sehir : liste2) {
//            System.out.println(sehir);
//        }

        List<String> liste3 = new ArrayList<>();
//        liste3.add("Artvin");
////        liste3.addAll(liste2);
//        liste3.addAll(0, liste2);
//        System.out.println(liste3);


        List<String> liste4 = liste2.subList(2, 5); // 2. den 5 e kadar alır.
//        System.out.println(liste4);

//        Object[] objects = liste4.toArray();
//        String[] strings = liste4.toArray(new String[0]);
//        System.out.println(strings[0]);

        liste4.clear();
        System.out.println(liste4);

    }
}
