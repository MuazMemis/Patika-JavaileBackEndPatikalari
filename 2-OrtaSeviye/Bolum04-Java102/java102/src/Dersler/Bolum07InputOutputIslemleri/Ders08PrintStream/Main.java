package Dersler.Bolum07InputOutputIslemleri.Ders08PrintStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "src/Dersler/Bolum7InputOutputIslemleri/Ders8PrintStream/print.txt";
        PrintStream output = new PrintStream(path);
        output.print(1234);
        output.print("Merhaba");
        output.close();

    }
}
