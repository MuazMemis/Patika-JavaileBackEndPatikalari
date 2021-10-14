package Dersler.Bolum7InputOutputIslemleri.Ders5ByteArrayStreamSinifi;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class InputStream {
    public static void main(String[] args) throws IOException {
        String path = "src/Dersler/Bolum7InputOutputIslemleri/Ders5ByteArrayStreamSinifi/patika.txt";
        byte[] dizi = {1, 2, 3, 54, 66, 6, 12, 3};
//        ByteArrayInputStream input = new ByteArrayInputStream(dizi);
        ByteArrayInputStream input = new ByteArrayInputStream(dizi, 2, 4);
//        System.out.println(input.read());
//        System.out.println(input.read());
//        System.out.println(input.read());
        System.out.println("Byte sayısı : " + input.available());
//        input.skip(2);

        int i = input.read();

        while (i != -1) {
            System.out.println(i);
            i = input.read();
        }
        input.close();

    }
}
