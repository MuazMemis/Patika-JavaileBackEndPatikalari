package Dersler.Bolum7InputOutputIslemleri.Ders4FileOutputStreamSinifi;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws IOException {
        String path = "src/Dersler/Bolum7InputOutputIslemleri/Ders4FileOutputStreamSinifi/patika.txt";
//        FileOutputStream output = new FileOutputStream(path); // dosya yoksa oluşturur. Varsa içeriğini sıfırlar.
        FileOutputStream output = new FileOutputStream(path, true); // Sonuna ekler. İçeriğini silmez.

        String yazi = "\nOutputStream öğreniyorum.\nPatika Dev";
        byte[] yaziBytes = yazi.getBytes(StandardCharsets.UTF_8);
        output.write(yaziBytes);
        output.close();
    }
}
