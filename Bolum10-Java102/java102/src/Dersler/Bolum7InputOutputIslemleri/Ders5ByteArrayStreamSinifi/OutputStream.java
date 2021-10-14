package Dersler.Bolum7InputOutputIslemleri.Ders5ByteArrayStreamSinifi;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class OutputStream {
    public static void main(String[] args) throws IOException {
        String data = "Java 102 Dersleri!";
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        byte[] dataByteArray = data.getBytes(StandardCharsets.UTF_8);
        output.write(dataByteArray);
        String newData = output.toString();
        System.out.println("Çıkış Akışı " + newData);
    }
}
