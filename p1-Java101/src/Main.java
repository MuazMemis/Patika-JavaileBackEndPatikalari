import Konular.OOP.Car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Car audi = new Car();
        audi.brand = "Audi";
        audi.model = "A3";
        audi.type = "Sedan";
        audi.speed = 10;
        audi.increaseSpeed(50);
        audi.printSpeed();
        audi.decreaseSpeed(30);
        audi.printSpeed();
    }
}
