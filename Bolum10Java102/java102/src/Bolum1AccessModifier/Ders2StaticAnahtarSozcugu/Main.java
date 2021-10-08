package Bolum1AccessModifier.Ders2StaticAnahtarSozcugu;

public class Main {
    public static void main(String[] args) {

        /*Player p1 = new Player("Muaz Memiş", 1);
//        p1.showName();
        Player.showName();*/

        Course mat = new Course("Mat-101", "MAT", "MAT", 70);
        Course fzk = new Course("fzk-101", "fzk", "fzk", 60);
        Course kim = new Course("kim-101", "kim", "kim", 90);
        Course bio = new Course("bio-101", "bio", "bio", 80);

        int[] notlar = {mat.note, fzk.note, kim.note, bio.note};
        Calculate.calcAvarage(notlar);

        Course[] dersler = {mat, fzk, kim, bio};
        Calculate.calcAvarageCourse(dersler);
    }
}
