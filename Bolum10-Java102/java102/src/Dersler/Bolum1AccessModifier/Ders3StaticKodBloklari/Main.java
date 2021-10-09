package Dersler.Bolum1AccessModifier.Ders3StaticKodBloklari;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. Program Başladı !");
        User u1 = new User("Muaz");
        User u2 = new User("Patika");

        System.out.println("Counter Son Değer : " + User.counter);
        System.out.println("Program Bitti !");
    }
}
