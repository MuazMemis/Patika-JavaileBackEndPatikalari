package Dersler.Bolum1AccessModifier.Ders2StaticAnahtarSozcugu;

public class Calculate {
    public static void calcAvarage(int[] notes) {
        double total = 0;
        for (int i : notes) {
            total += i;
        }

        double avarage = total / notes.length;
        System.out.println("Ortalamanız : " + avarage);
    }

    public static void calcAvarageCourse(Course[] courses) {
        double total = 0;
        for (Course c : courses) {
            total += c.note;
        }

        double avarage = total / courses.length;
        System.out.println("Ortalamanız : " + avarage);
    }
}
