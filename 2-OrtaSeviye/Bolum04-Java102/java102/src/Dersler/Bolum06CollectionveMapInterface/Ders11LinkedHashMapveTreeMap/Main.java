package Dersler.Bolum06CollectionveMapInterface.Ders11LinkedHashMapveTreeMap;


import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
       /* LinkedHashMap<Integer, Student> students = new LinkedHashMap<>();

        students.put(102, new Student("Mustafa", 20));
        students.put(110, new Student("Ahmet", 100));
        students.put(108, new Student("Bekir", 40));
        students.put(118, new Student("Hasan", 50));

        for (Student student : students.values()) {
            System.out.println(student.getName() + "\t : " + student.getNote());
        }*/

        TreeMap<Integer, Student2> students = new TreeMap<>(new OrderByComparator());
//        TreeMap<Integer, Student2> students = new TreeMap<>(new OrderByComparator().reversed());
//        TreeMap<Integer, Student2> students = new TreeMap<>(); // Aynı işlevi görüyor.
//        TreeMap<Integer, Student2> students = new TreeMap<>(Comparator.reverseOrder()); // Aynı işlevi görüyor.

        students.put(102, new Student2(102, "Mustafa", 20));
        students.put(110, new Student2(110, "Ahmet", 100));
        students.put(108, new Student2(108, "Bekir", 40));
        students.put(118, new Student2(118, "Hasan", 50));

        for (Student2 student : students.values()) {
            System.out.println(student.getName() + "\t : " + student.getNote());
        }
    }
}
