package Dersler.Bolum7InputOutputIslemleri.Ders11FileReaderveFileWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class Writer {
    public static void main(String[] args) throws IOException {
        String path = "src/Dersler/Bolum7InputOutputIslemleri/Ders11FileReaderveFileWriter/output.txt";
        String data = "Java ÖĞRENİYORUM";
        FileWriter fileWriter = new FileWriter(path);
//        FileWriter fileWriter = new FileWriter(path, Charset.forName("Big5"));
        fileWriter.write(data);
        fileWriter.close();
    }
}
