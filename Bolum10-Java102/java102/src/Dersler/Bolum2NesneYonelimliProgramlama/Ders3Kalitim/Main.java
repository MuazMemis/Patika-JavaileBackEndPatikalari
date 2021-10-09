package Dersler.Bolum2NesneYonelimliProgramlama.Ders3Kalitim;

public class Main {
    public static void main(String[] args) {
        Calisan c1 = new Calisan("Muaz Memiş", "0530", "muaz@gmail.com");
//        System.out.println(c1.getAdSoyad());
//        c1.giris();
//        c1.getBolum(); // alt sınıfın özelliklerine erişemez.

        Akademisyen a1 = new Akademisyen("Patika Dev", "0567", "bllgi@patika.dev",
                "CENG", "Doçent");
//        System.out.println(a1.getAdSoyad());
//        a1.yemekhane();
//        System.out.println(a1.getBolum());
//        a1.derseGir();

        /*Calisan m1 = new Memur("Ali Veli", "4653", "sadl@patika.dev",
                "Bilgi İşlem", "09:00-18:00");
        m1.yemekhane();
//        m1.calis(); // metotlara erişilemez.*/

        Memur m1 = new Memur("Ali Veli", "4653", "sadl@patika.dev",
                "Bilgi İşlem", "09:00-18:00");
//        m1.yemekhane();
//        m1.calis();

        OgretimGorevlisi o1 = new OgretimGorevlisi("Mehmet Altın", "0256",
                "mehmet@gmail.com", "CENG", "Doçent", "110");
//        o1.giris();
//        o1.derseGir();
//        System.out.println(o1.getKapiNo());


        Asistan asistan = new Asistan("Mehmet2 Altın", "02562",
                "mehmet@gmail.com", "CENG2", "Asistan", "110");
//        asistan.quizYap();


        LabAsistan labAsistan = new LabAsistan("Mehmet2 Altın", "02562",
                "mehmet@gmail.com", "CENG2", "Asistan", "110");
//        labAsistan.derseGir();
//        labAsistan.lablaraGir();

        BilgiIslem bilgiIslem = new BilgiIslem("Ali Veli", "4653", "sadl@patika.dev",
                "Bilgi İşlem", "09:00-18:00","Bilgi İşlem");
//        bilgiIslem.networkKurulum();

        GuvenlikGorevlisi guvenlikGorevlisi = new GuvenlikGorevlisi("Ali Veli", "4653", "sadl@patika.dev",
                "Bilgi İşlem", "09:00-18:00","Silah");
        guvenlikGorevlisi.nobet();

    }
}
