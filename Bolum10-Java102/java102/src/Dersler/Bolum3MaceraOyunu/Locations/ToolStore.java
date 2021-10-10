package Dersler.Bolum3MaceraOyunu.Locations;

import Dersler.Bolum3MaceraOyunu.Game;
import Dersler.Bolum3MaceraOyunu.Player;
import Dersler.Bolum3MaceraOyunu.Weapon;

public class ToolStore extends NormalLocation {
    public ToolStore(Player player) {
        super(player, "Mağaza");
    }

    @Override
    public boolean onLocation() {
        System.out.println("Mağazaya hoşgeldiniz !");
        System.out.println("1 - Silahlar");
        System.out.println("2 - Zırhlar");
        System.out.println("3 - Çıkış Yap");
        System.out.print("Seçiminiz : ");

        int selectCase = Game.input.nextInt();
        while (selectCase < 1 || selectCase > 3) {
            System.out.println("Geçersiz değer, tekrar giriniz : ");
            selectCase = Game.input.nextInt();
        }

        switch (selectCase) {
            case 1:
                printWeapon();
                buyWeapon();
                break;
            case 2:
                printArmor();
                break;
            case 3:
                System.out.println("Bir daha bekleriz.");
                return true;

        }

        return true;
    }

    public void printWeapon() {
        System.out.println("------ Silahlar ------");
        for (Weapon w : Weapon.weapons()) {
            System.out.println(w.getId() + " - " + w.getName() + "\t Para : " + w.getPrice() +
                    "\t Hasar : " + w.getDamage());
        }
    }

    public void buyWeapon() {
        System.out.print("Bir silah seçiniz : ");
        int selectWeaponID = Game.input.nextInt();

        while (selectWeaponID < 1 || selectWeaponID > Weapon.weapons().length) {
            System.out.println("Geçersiz değer tekrar giriniz : ");
            selectWeaponID = Game.input.nextInt();
        }

        Weapon selectedWeapon = Weapon.getWeaponObjById(selectWeaponID);

        if (selectedWeapon != null) {
            if (selectedWeapon.getPrice() > this.getPlayer().getMoney()) {
                System.out.println("Yeterli paranız bulunmamaktadır.");
            } else {
                System.out.println(selectedWeapon.getName() + " silahını satın aldınız ! ");
                int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
                this.getPlayer().setMoney(balance);
                System.out.println("Kalan paranız : " + this.getPlayer().getMoney());
                this.getPlayer().getInventory().setWeapon(selectedWeapon);
            }
        }
    }

    public void printArmor() {
        System.out.println("Zırhlar");
    }
}
