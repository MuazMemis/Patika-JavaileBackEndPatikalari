package Dersler.Bolum07InputOutputIslemleri.Ders13PrintWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "src/Dersler/Bolum7InputOutputIslemleri/Ders13PrintWriter/output.txt";
        String data = "Java ÖĞRENİYORUM";

        File file = new File(path);
        PrintWriter printWriter = new PrintWriter(file);
        printWriter.print(12134);
        printWriter.print(data);
        printWriter.close();
    }
}
