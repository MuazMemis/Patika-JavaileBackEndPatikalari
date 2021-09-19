package Konular.OOP;

public class Car {
    public String color;
    public String name;
    public String type;
    public String brand;
    public String model;

    public int speed;
    public int speedLimit = 180;

    public int increaseSpeed(int increment) {
        if (speed + increment < speedLimit)
            speed += increment;
        return speed;
    }

    public int decreaseSpeed(int decrease) {
        if (speed > 0)
            speed -= decrease;
        return speed;
    }

    public void printSpeed() {
        System.out.println(model + " Hızı: " + speed);
    }
}
