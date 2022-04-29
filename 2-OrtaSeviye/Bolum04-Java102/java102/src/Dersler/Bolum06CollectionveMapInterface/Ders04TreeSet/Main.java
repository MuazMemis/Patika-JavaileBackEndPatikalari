package Dersler.Bolum06CollectionveMapInterface.Ders04TreeSet;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
//        TreeSet<Student> students = new TreeSet<>(new OrderNoteComparator());
//        TreeSet<Student> students = new TreeSet<>(new OrderNoteComparator().reversed()); // büyükten küçüğe sıralar.
//        TreeSet<Student> students = new TreeSet<>(new OrderNameComparator());
        TreeSet<Student> students = new TreeSet<>(new OrderNameComparator().reversed());

        students.add(new Student("Mustafa", 20));
        students.add(new Student("Ahmet", 100));
        students.add(new Student("Bekir", 40));
        students.add(new Student("Hasan", 50));
        students.add(new Student("Hasan", 60));
        students.add(new Student("Cenk", 70));

        for (Student student : students) {
            System.out.println(student.getName() + "\t : " + student.getNote());
        }

    }
}
