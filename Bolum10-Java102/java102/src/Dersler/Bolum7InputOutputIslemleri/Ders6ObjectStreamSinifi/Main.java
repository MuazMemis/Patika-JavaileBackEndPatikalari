package Dersler.Bolum7InputOutputIslemleri.Ders6ObjectStreamSinifi;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String path = "src/Dersler/Bolum7InputOutputIslemleri/Ders6ObjectStreamSinifi/araba.txt";

        Car c1 = new Car("Audi", "A3");

        /*FileOutputStream outputFile = new FileOutputStream(path);
        ObjectOutputStream output = new ObjectOutputStream(outputFile);
        output.writeObject(c1);
        output.close();*/

        FileInputStream inputFile = new FileInputStream(path);
        ObjectInputStream inputStream = new ObjectInputStream(inputFile);
        Car newCar = (Car) inputStream.readObject();
        System.out.println(newCar.getBrand());
        System.out.println(newCar.getModel());

        inputFile.close();
        inputStream.close();

    }
}
