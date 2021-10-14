package Dersler.Bolum7InputOutputIslemleri.Ders12BufferedReaderWriter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
    public static void main(String[] args) throws IOException {
        String path = "src/Dersler/Bolum7InputOutputIslemleri/Ders12BufferedReaderWriter/patika.txt";
        String data = "Java ÖĞRENİYORUM";

        FileReader reader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(reader);

        /*String line = bufferedReader.readLine();
        while (line != null) {
            System.out.println(line);
            line = bufferedReader.readLine();
        }*/
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            System.out.print(line + " ****** ");
        }
    }
}
