package Dersler.Bolum07InputOutputIslemleri.Ders09InputStreamReader;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        String path = "src/Dersler/Bolum7InputOutputIslemleri/Ders9InputStreamReader/patika.txt";
        FileInputStream fileInput = new FileInputStream(path);
        InputStreamReader inputReader = new InputStreamReader(fileInput);
//        InputStreamReader inputReader = new InputStreamReader(fileInput, "UTF8");
//        InputStreamReader inputReader = new InputStreamReader(fileInput, Charset.defaultCharset());
//        InputStreamReader inputReader = new InputStreamReader(fileInput, Charset.forName("Big5"));
//        InputStreamReader inputReader = new InputStreamReader(fileInput, Charset.forName("US-ASCII"));

        /*int i = fileInput.read();
        while (i != -1) {
            System.out.print((char) i);
            i = fileInput.read();
        }*/

        System.out.println(inputReader.getEncoding());

        int i = inputReader.read();
        while (i != -1) {
            System.out.print((char) i);
            i = inputReader.read();
        }
    }
}
