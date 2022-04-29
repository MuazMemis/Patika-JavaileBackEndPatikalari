package Dersler.Bolum07InputOutputIslemleri.Ders11FileReaderveFileWriter;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class Reader {
    public static void main(String[] args) throws IOException {
        String path = "src/Dersler/Bolum7InputOutputIslemleri/Ders11FileReaderveFileWriter/patika.txt";
//        FileReader reader = new FileReader(path);
        FileReader reader = new FileReader(path, Charset.forName("Big5"));
        reader.skip(2);
        int i = reader.read();
        while (i != -1) {
            System.out.print((char) i);
            i = reader.read();
        }

        reader.close();
    }
}
