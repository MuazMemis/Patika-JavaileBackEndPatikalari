import Konular.OOP.Car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Car audi = new Car("A3", "Siyah", 20);
        audi.brand = "Audi";
        audi.increaseSpeed(50);
        audi.printSpeed();
        audi.decreaseSpeed(30);
        audi.printSpeed();
        audi.printInfo();

        Car bmw = new Car();
    }
}
