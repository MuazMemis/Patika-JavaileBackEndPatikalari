package Dersler.Bolum1AccessModifier.Ders2StaticAnahtarSozcugu;

public class Course {
    String name;
    String code;
    String prefix;
    int note;

    public Course(String name, String code, String prefix, int note) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = note;
    }

    public static void courseList() {
        String[] courseList = {"fizik", "kimya", "matematik"};
        for (String courseName : courseList) {
            System.out.println(courseName);
        }
    }

}