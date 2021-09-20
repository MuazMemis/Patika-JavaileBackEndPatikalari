package Konular.OOP.BoksOyunu;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;

    public Fighter(String name, int damage, int health, int weight, double dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;

        if (dodge >= 0 && dodge <= 100) {
            this.dodge = dodge;
        } else {
            this.dodge = 0;
        }
    }

    public int hit(Fighter foe) {
        if (foe.isDodge()) {
            System.out.println(foe.name + " gelen hasarı blokladı.");
            return foe.health;
        }

        System.out.println(this.name + " => " + foe.name + " " + this.damage + " hasar vurdu.");

        if (foe.health - this.damage < 0) {
            return 0;
        }
        return foe.health -= this.damage;
    }

    public boolean isDodge() {
        double randomNumber = Math.random() * 100;

        if (this.dodge >= randomNumber) {
            return true;
        } else {
            return false;
        }

    }
}
