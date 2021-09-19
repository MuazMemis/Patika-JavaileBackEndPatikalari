package Konular.OOP;

public class Car {
    public String color;
    public String name;
    public String type;
    public String brand;
    public String model;

    public int speed;
    public int speedLimit = 180;

    public Car(String model, String color, int speed) {
        System.out.println("Parametreli kurucu metod.");
        this.model = model;
        this.speed = speed;
        this.color = color;
        this.type = "Sedan";
        this.speedLimit = 180;
    }

    public Car(){
        System.out.println("Parametresiz kurucu metod.");
    }

    public int increaseSpeed(int increment) {
        if (this.speed + increment < this.speedLimit)
            this.speed += increment;
        return this.speed;
    }

    public int decreaseSpeed(int decrease) {
        if (this.speed > 0)
            this.speed -= decrease;
        return speed;
    }

    public void printSpeed() {
        System.out.println(this.model + " Hızı: " + this.speed);
    }

    public void printInfo() {
        System.out.println("==============");
        System.out.println("Model \t:" + this.model);
        System.out.println("Color \t:" + this.color);
        System.out.println("Type \t:" + this.type);
        System.out.println("Speed \t:" + this.speed);
        System.out.println("==============");
    }
}
