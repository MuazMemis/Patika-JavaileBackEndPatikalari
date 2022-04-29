package Dersler.Bolum02NesneYonelimliProgramlama.Ders5Polymorphism;

public class Main {
    public static void main(String[] args) {
        Calisan c1 = new Calisan("Muaz Memiş", "0530", "muaz@gmail.com");

        Akademisyen a1 = new Akademisyen("Patika Dev", "0567", "bllgi@patika.dev",
                "CENG", "Doçent");

        Memur m1 = new Memur("Ali Veli", "4653", "sadl@patika.dev",
                "Bilgi İşlem", "09:00-18:00");

        OgretimGorevlisi o1 = new OgretimGorevlisi("Mehmet Altın", "0256",
                "mehmet@gmail.com", "CENG", "Doçent", "110");

//        o1.giris();
//        a1.giris();
//        c1.giris();
//        m1.giris();

        /*Calisan a2 = new Akademisyen("Kodluyoruz", "0567", "bllgi@patika.dev",
                "CENG", "Doçent");
        a2.giris(); // Calisan sınıfın içindeki metotları kullanabilir.*/

//        int[] loginUser = new int[5];
//        Akademisyen[] loginuser = {c1, a1, m1, o1};

        Calisan[] loginuser = {c1, a1, m1, o1};
        Calisan.girisYapanlar(loginuser);

    }
}
