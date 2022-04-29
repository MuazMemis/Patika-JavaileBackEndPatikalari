package Dersler.Bolum07InputOutputIslemleri.Ders07BufferedStreamSinifi;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class InputStream {
    public static void main(String[] args) throws IOException {
        String path = "src/Dersler/Bolum7InputOutputIslemleri/Ders7BufferedStreamSinifi/patika.txt";

        FileInputStream fileInputStream = new FileInputStream(path);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

        int i = bufferedInputStream.read();
        while (i != -1) {
            System.out.print((char) i);
            i = bufferedInputStream.read();
        }
    }
}
