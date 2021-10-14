package Dersler.Bolum7InputOutputIslemleri.Ders3FileInputStreamSinifi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String path = "src/Dersler/Bolum7InputOutputIslemleri/Ders3FileInputStreamSinifi/patika.txt";
//        File file = new File(path);
//        file.createNewFile();
        FileInputStream inputStream = new FileInputStream(path);
//        System.out.println(inputStream.read());
//        System.out.println(inputStream.read());

        /*int i = inputStream.read();
        while (i != -1) {
            System.out.print((char) i);
            i = inputStream.read();
        }*/

        /*System.out.println("Kullanılabilir byte sayısı : " + inputStream.available());
        inputStream.read();
        inputStream.read();
        inputStream.read();
        System.out.println("Kullanılabilir byte sayısı : " + inputStream.available());*/

        inputStream.skip(10); // ilk 10 karakteri atlar.
        int i = inputStream.read();
        while (i != -1) {
            System.out.print((char) i);
            i = inputStream.read();
        }

        inputStream.close();
    }
}
