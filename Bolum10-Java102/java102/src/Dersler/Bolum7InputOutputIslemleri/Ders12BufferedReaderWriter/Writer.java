package Dersler.Bolum7InputOutputIslemleri.Ders12BufferedReaderWriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class Writer {
    public static void main(String[] args) throws IOException {
        String path = "src/Dersler/Bolum7InputOutputIslemleri/Ders12BufferedReaderWriter/output.txt";
        String data = "Java ÖĞRENİYORUM";

        File file = new File(path);
//        FileWriter fileWriter = new FileWriter(file);
        FileWriter fileWriter = new FileWriter(file, Charset.forName("US-ASCII"));
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write(data);

        bufferedWriter.close();
        fileWriter.close();

    }
}
