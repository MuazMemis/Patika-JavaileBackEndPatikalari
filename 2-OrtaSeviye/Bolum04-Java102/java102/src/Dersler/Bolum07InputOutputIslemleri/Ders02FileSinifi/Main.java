package Dersler.Bolum07InputOutputIslemleri.Ders02FileSinifi;

import java.io.File;

public class Main {
    public static void main(String[] args) {
//        File dizin = new File("src/Dersler/Bolum7InputOutputIslemleri/Ders2FileSinifi/test");
//        dizin.mkdir();

//        File dosya = new File("src/Dersler/Bolum7InputOutputIslemleri/Ders2FileSinifi/test/patika.txt");
        /*try {
            if (dosya.createNewFile()) {
                System.out.println(dosya.getName() + " dosyası oluşturuldu !");
            } else {
                System.out.println(dosya.getName() + " dosyası zaten mevcut.");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }*/

//        System.out.println(dosya.delete());


        /*File dizin = new File("src/Dersler/Bolum7InputOutputIslemleri/Ders2FileSinifi/patika/dev");
        System.out.println(dizin.mkdirs());

        try {
            System.out.println(dosya.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        File dizin = new File("src/Dersler/Bolum7InputOutputIslemleri/Ders2FileSinifi/test");
        for (String s : dizin.list()) {
            System.out.println(s);
        }
    }
}
