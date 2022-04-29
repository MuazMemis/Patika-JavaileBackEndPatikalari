package Dersler.Bolum07InputOutputIslemleri.Ders07BufferedStreamSinifi;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStream {
    public static void main(String[] args) throws IOException {
        String path = "src/Dersler/Bolum7InputOutputIslemleri/Ders7BufferedStreamSinifi/patika.txt";
        String data = "Java 102 Patikasi";

        FileOutputStream file = new FileOutputStream(path);
        BufferedOutputStream bufferedFile = new BufferedOutputStream(file);

        byte[] bytes = data.getBytes();

        bufferedFile.write(bytes);

        bufferedFile.close(); // Önce buff i kapat. 
        file.close();
    }
}
