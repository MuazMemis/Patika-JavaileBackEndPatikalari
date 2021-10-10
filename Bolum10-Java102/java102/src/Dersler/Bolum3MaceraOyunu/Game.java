package Dersler.Bolum3MaceraOyunu;

import Dersler.Bolum3MaceraOyunu.Locations.Battle.Cave;
import Dersler.Bolum3MaceraOyunu.Locations.Battle.Forest;
import Dersler.Bolum3MaceraOyunu.Locations.Battle.River;
import Dersler.Bolum3MaceraOyunu.Locations.Location;
import Dersler.Bolum3MaceraOyunu.Locations.Normal.SafeHouse;
import Dersler.Bolum3MaceraOyunu.Locations.Normal.ToolStore;

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
            System.out.println();
            System.out.println("********** Bölgeler **********");
            System.out.println();
            System.out.println("1 - Güvenli Ev -> Burası sizin için güvenli bir ev, düşman yok !");
            System.out.println("2 - Eşya Dükkanı -> Silah veya Zırh satın alabilirsiniz ! ");
            System.out.println("3 - Mağara -> Ödül <Yemek> , dikkatli ol zombi çıkabilir ! ");
            System.out.println("4 - Orman -> Ödül <Odun> , dikkatli ol vampir çıkabilir ! ");
            System.out.println("5 - Nehir -> Ödül <Su> , dikkatli ol ayı çıkabilir ! ");
            System.out.println("0 - Çıkış Yap -> Oyunu sonlandır ! ");
            System.out.print("Lütfen gitmek istediğiniz bölgeyi seçiniz : ");
            int selectLocation = input.nextInt();

            switch (selectLocation) {
                case 0 -> location = null;
                case 1 -> location = new SafeHouse(player);
                case 2 -> location = new ToolStore(player);
                case 3 -> location = new Cave(player);
                case 4 -> location = new Forest(player);
                case 5 -> location = new River(player);
                default -> System.out.println("Lütfen geçerli bir bölge seçiniz.");
            }

            if (location == null) {
                System.out.println("Oyun bitti yine bekleriz.");
                break;
            }

            if (!location.onLocation()) {
                System.out.println("GAME OVER");
                break;
            }
        }


    }
}
