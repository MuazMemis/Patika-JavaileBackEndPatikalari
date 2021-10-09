package Dersler.Bolum2NesneYonelimliProgramlama.Ders2SınıflarArasi;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Muaz", "Memiş", "123", "AA", 80);
        Student s2 = new Student("Muaz2", "Memiş2", "1232", "bb", 85);
        Student s3 = new Student("Muaz3", "Memiş3", "1233", "cc", 85);
//        s2.setNote(85);
//        System.out.println(s2.getNote());

        Instructor teacher = new Instructor("Ahmet", "Çetin", "CENG");

        Course mat = new Course("Mat101", "mat", teacher);
        System.out.println(mat.getInstructor().getName());

//        Student[] students = {s1, s2, s3};
//        System.out.println("Ortalama : " + mat.calulateAvarage(students));

    }
}
