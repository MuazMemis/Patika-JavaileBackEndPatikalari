import Konular.OOP.Car;
import Konular.OOP.OgrenciNotSistemi.Course;
import Konular.OOP.OgrenciNotSistemi.Student;
import Konular.OOP.OgrenciNotSistemi.Teacher;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("Mahmut Hoca", "55356846", "TRH");
        Teacher teacher2 = new Teacher("Mehmet Hoca", "5612", "KMY");
        Teacher teacher3 = new Teacher("Külyutmaz", "561232", "BIO");

        Course tarih = new Course("Tarih", "KMY101", "TRH");
        tarih.addTeacher(teacher1);

        Course kimya = new Course("Kimya", "KMY101", "KMY");
        kimya.addTeacher(teacher2);

        Course bio = new Course("Bio", "KMY101", "BIO");
        bio.addTeacher(teacher3);


        Student s1 = new Student("İnek Şaban", 4, "5", tarih, kimya, bio);
        s1.addBulkExamNote(100, 79, 50);
        s1.isPass();
        s1.calcAvarage();
    }
}
