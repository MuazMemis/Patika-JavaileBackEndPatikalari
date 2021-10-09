package Dersler.Bolum2NesneYonelimliProgramlama.Ders2SınıflarArasi;

public class Course {
    private String courseName;
    private String code;
    private Instructor instructor;

    public Course(String courseName, String code, Instructor instructor) {
        this.courseName = courseName;
        this.code = code;
        this.instructor = instructor;
    }


    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public double calulateAvarage(Student[] students) {
        Student s4 = new Student("", "", "", "", 100);
        double total = 0;

       /* for (int i = 0; i < students.length; i++) {
            total += students[i].getNote();
        }*/

        for (Student student : students) {
            total += student.getNote();
        }

        total += s4.getNote();

        double avarage = total / students.length;
        return avarage;
    }
}
