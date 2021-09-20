package Konular.OOP.OgrenciNotSistemi;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
    }

    public void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
            System.out.println(teacher.name + " eklendi.");
        } else
            System.out.println("Öğretmen ve ders bölümleri uyuşmuyor.");
    }

    public void printTeacherInfo() {
        this.teacher.print();
    }
}
