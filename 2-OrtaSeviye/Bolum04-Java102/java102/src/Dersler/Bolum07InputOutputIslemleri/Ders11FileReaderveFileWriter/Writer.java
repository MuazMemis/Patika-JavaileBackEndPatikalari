package Dersler.Bolum07InputOutputIslemleri.Ders11FileReaderveFileWriter;

import java.io.FileWriter;
import java.io.IOException;

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
