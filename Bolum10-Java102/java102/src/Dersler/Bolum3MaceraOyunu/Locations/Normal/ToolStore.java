package Dersler.Bolum3MaceraOyunu.Locations.Normal;

import Dersler.Bolum3MaceraOyunu.Game;
import Dersler.Bolum3MaceraOyunu.Items.Armor;
import Dersler.Bolum3MaceraOyunu.Player;
import Dersler.Bolum3MaceraOyunu.Items.Weapon;

public class ToolStore extends NormalLocation {
    public ToolStore(Player player) {
        super(player, "Mağaza");
    }

    @Override
    public boolean onLocation() {
        System.out.println("Mağazaya hoşgeldiniz !");

        boolean showMenu = true;

        while (showMenu) {
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
                case 1 -> {
                    printWeapon();
                    buyWeapon();
                }
                case 2 -> {
                    printArmor();
                    buyArmor();
                }
                case 3 -> {
                    System.out.println("Bir daha bekleriz.");
                    showMenu = false;
                }
            }
        }

        return true;
    }

    public void printWeapon() {
        System.out.println("------ Silahlar ------");
        for (Weapon w : Weapon.weapons()) {
            System.out.println(w.getId() + " - " + w.getName() + "\t< Para : " + w.getPrice() +
                    "\t Hasar : " + w.getDamage() + " >");
        }
        System.out.println("0 - Çıkış Yap");
    }

    public void buyWeapon() {
        System.out.print("Bir silah seçiniz : ");
        int selectWeaponID = Game.input.nextInt();

        while (selectWeaponID < 0 || selectWeaponID > Weapon.weapons().length) {
            System.out.print("Geçersiz değer tekrar giriniz : ");
            selectWeaponID = Game.input.nextInt();
        }

        if (selectWeaponID != 0) {
            Weapon selectedWeapon = Weapon.getWeaponObjById(selectWeaponID);

            if (selectedWeapon != null) {
                if (selectedWeapon.getPrice() > this.getPlayer().getMoney()) {
                    System.out.println("Yeterli paranız bulunmamaktadır.");
                } else {
                    System.out.println(selectedWeapon.getName() + " silahını satın aldınız ! ");
                    int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Kalan Bakiye : " + this.getPlayer().getMoney());
                    this.getPlayer().getInventory().setWeapon(selectedWeapon);
                }
            }
        }
    }

    public void printArmor() {
        System.out.println("------ Zırhlar ------");

        for (Armor a : Armor.armors()) {
            System.out.println(a.getId() + " - " + a.getName() + "\t < Para : " + a.getPrice() +
                    "\t Blok : " + a.getBlock() + " >");
        }

        System.out.println("0 - Çıkış Yap");
    }

    public void buyArmor() {
        System.out.print("Bir zırh seçiniz : ");
        int selectArmorID = Game.input.nextInt();

        while (selectArmorID < 0 || selectArmorID > Armor.armors().length) {
            System.out.print("Geçersiz değer tekrar giriniz : ");
            selectArmorID = Game.input.nextInt();
        }

        if (selectArmorID != 0) {
            Armor selectedArmor = Armor.getArmorObjById(selectArmorID);

            if (selectedArmor != null) {
                if (selectedArmor.getPrice() > this.getPlayer().getMoney()) {
                    System.out.println("Yeterli paranız bulunmamaktadır.");
                } else {
                    System.out.println(selectedArmor.getName() + " zırhını satın aldınız ! ");
                    this.getPlayer().setMoney(this.getPlayer().getMoney() - selectedArmor.getPrice());
                    System.out.println("Kalan Bakiye : " + this.getPlayer().getMoney());
                    this.getPlayer().getInventory().setArmor(selectedArmor);
                }
            }
        }
    }
}
