package Dersler.Bolum3MaceraOyunu.Locations.Battle;

import Dersler.Bolum3MaceraOyunu.Obstacles.Zombie;
import Dersler.Bolum3MaceraOyunu.Player;

public class Cave extends BattleLocation {
    public Cave(Player player) {
        super(player, "Mağara", new Zombie(), "food", 3);
    }
}
