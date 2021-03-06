package Konular.OOP.BoksOyunu;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {
        if (isCheck()) {
            while (this.f1.health > 0 && this.f2.health > 0) {
                System.out.println("****** Yeni Round *******");
                this.f2.health = this.f1.hit(f2);

                if (isWin()) {
                    System.out.println(this.f1.name + " Sağlık : " + this.f1.health);
                    System.out.println(this.f2.name + " Sağlık : " + this.f2.health);
                    break;
                }

                this.f1.health = this.f2.hit(f1);

                if (isWin()) {
                    System.out.println(this.f1.name + " Sağlık : " + this.f1.health);
                    System.out.println(this.f2.name + " Sağlık : " + this.f2.health);
                    break;
                }

                System.out.println(this.f1.name + " Sağlık : " + this.f1.health);
                System.out.println(this.f2.name + " Sağlık : " + this.f2.health);
            }
        } else {
            System.out.println("Sporcuların şirketleri uymuyor.");
        }
    }

    public boolean isCheck() {
        return (this.f1.weight >= this.minWeight && this.f1.weight <= this.maxWeight) &&
                (this.f2.weight >= this.minWeight && this.f2.weight <= this.maxWeight);
    }

    public boolean isWin() {
        if (this.f1.health == 0) {
            System.out.println(this.f2.name + " kazandı!");
            return true;
        }

        if (this.f2.health == 0) {
            System.out.println(this.f1.name + " kazandı!");
            return true;
        }

        return false;
    }
}
