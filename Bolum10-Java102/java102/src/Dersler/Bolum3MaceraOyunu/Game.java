package Dersler.Bolum3MaceraOyunu;

import Dersler.Bolum3MaceraOyunu.Locations.Location;
import Dersler.Bolum3MaceraOyunu.Locations.SafeHouse;
import Dersler.Bolum3MaceraOyunu.Locations.ToolStore;

import java.util.Scanner;

public class Game {
    public static final Scanner input = new Scanner(System.in);

    public void start() {
        System.out.println("Macera Oyununa Hoşgeldiniz !");
//        System.out.print("Lütfen bir isim giriniz : ");
//        String playerName = input.nextLine();
        Player player = new Player("Muaz");
        System.out.println("Sayın " + player.getName() + " bu karanlık ve sisli adaya hoşgeldiniz. Burada yaşananların hepsi gerçek.");
        System.out.println("Lütfen bir karakter seçiniz!");
        player.selectChar();

        Location location = null;

        while (true) {
            player.printInfo();
            System.out.println("");
            System.out.println("********** Bölgeler **********");
            System.out.println("");
            System.out.println("1 - Güvenli Ev -> Burası sizin için güvenli bir ev, düşman yok !");
            System.out.println("2 - Mağaza -> Silah veya Zırh satın alabilirsiniz ! ");
            System.out.print("Lütfen gitmek istediğiniz bölgeyi seçiniz : ");
            int selectLocation = input.nextInt();

            switch (selectLocation) {
                case 1 -> location = new SafeHouse(player);
                case 2 -> location = new ToolStore(player);
                default -> System.out.println("Bölge seçiniz.");
            }

            if (!location.onLocation()) {
                System.out.println("GAME OVER");
                break;
            }
        }


    }
}
