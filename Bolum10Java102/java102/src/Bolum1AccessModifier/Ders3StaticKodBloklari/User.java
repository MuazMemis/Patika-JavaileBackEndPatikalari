package Bolum1AccessModifier.Ders3StaticKodBloklari;

public class User {
    public String name;
    public static int counter;

    static {
        System.out.println("2. Static Kod Bloğu");
        int random = (int) (Math.random() * 100);
        System.out.println("3. Random Sayı : " + random);
        counter = random;
        System.out.println("4. Counter varsayılan deeğr : " + counter);
    }

    public User(String name) {
        this.name = name;
        counter++;
        System.out.println("Counter Yeni Değer : " + counter);
    }
/*
    // Her new lendiğinde çalışır.
    {
        System.out.println("Ben bir statik kod bloğuyum.");
    }

    // Tek sefer çalışır.
    static {
        System.out.println("Ben statik olarak tanımlanmış, statik kod bloğuyum.");
    }
    */

}
