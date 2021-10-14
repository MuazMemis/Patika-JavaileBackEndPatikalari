package Dersler.Bolum7InputOutputIslemleri.Ders10OutputStreamWriter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws IOException {
        String path = "src/Dersler/Bolum7InputOutputIslemleri/Ders10OutputStreamWriter/output.txt";
        String data = "ĞÜŞİ";
        FileOutputStream fileOutput = new FileOutputStream(path);
//        fileOutput.write(data.getBytes());
//        fileOutput.write(data.getBytes(Charset.forName("Big5")));

//        OutputStreamWriter fileWriter = new OutputStreamWriter(fileOutput);
        OutputStreamWriter fileWriter = new OutputStreamWriter(fileOutput, Charset.forName("Big5"));
        System.out.println(fileWriter.getEncoding());
        fileWriter.write(data);
        fileWriter.close();
        fileOutput.close();
    }
}
