package Dersler.Bolum2NesneYonelimliProgramlama.Ders4MethodOverriding;

public class Main {
    public static void main(String[] args) {
        Calisan c1 = new Calisan("Muaz Memiş", "0530", "muaz@gmail.com");

        Akademisyen a1 = new Akademisyen("Patika Dev", "0567", "bllgi@patika.dev",
                "CENG", "Doçent");

        Memur m1 = new Memur("Ali Veli", "4653", "sadl@patika.dev",
                "Bilgi İşlem", "09:00-18:00");

        OgretimGorevlisi o1 = new OgretimGorevlisi("Mehmet Altın", "0256",
                "mehmet@gmail.com", "CENG", "Doçent", "110");
        o1.giris();
//        o1.giris("10:00");
//        o1.giris("10:00", "16:00");


    }
}
