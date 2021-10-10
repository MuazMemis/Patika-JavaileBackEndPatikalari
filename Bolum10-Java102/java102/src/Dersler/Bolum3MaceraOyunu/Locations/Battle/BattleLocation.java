package Dersler.Bolum3MaceraOyunu.Locations.Battle;

import Dersler.Bolum3MaceraOyunu.Game;
import Dersler.Bolum3MaceraOyunu.Locations.Location;
import Dersler.Bolum3MaceraOyunu.Obstacles.Obstacle;
import Dersler.Bolum3MaceraOyunu.Player;

import java.util.Locale;
import java.util.Random;

public abstract class BattleLocation extends Location {
    private Obstacle obstacle;
    private String award;
    private int maxObstacle;

    public BattleLocation(Player player, String name, Obstacle obstacle, String award, int maxObstacle) {
        super(player, name);
        this.obstacle = obstacle;
        this.award = award;
        this.maxObstacle = maxObstacle;
    }

    @Override
    public boolean onLocation() {
        int obsNumber = this.randomObstacleNumber();
        System.out.println("Şuan buradasınız : " + this.getName());
        System.out.println("Dikkatli ol! Burada : " + obsNumber + " tane " +
                this.getObstacle().getName() + " yaşıyor !");
        System.out.print("<S>avaş veya <K>aç : ");

        Game.input.nextLine();
        String selectCase = Game.input.nextLine();
        selectCase = selectCase.toUpperCase(Locale.ROOT);

        if (selectCase.equals("S")) {
            System.out.println("Savaş işlemleri olacak.");
        } else {
            System.out.println("Kaçış");
        }

        return true;
    }

    public int randomObstacleNumber() {
        Random random = new Random();
        return random.nextInt(getMaxObstacle()) + 1;
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public int getMaxObstacle() {
        return maxObstacle;
    }

    public void setMaxObstacle(int maxObstacle) {
        this.maxObstacle = maxObstacle;
    }
}
