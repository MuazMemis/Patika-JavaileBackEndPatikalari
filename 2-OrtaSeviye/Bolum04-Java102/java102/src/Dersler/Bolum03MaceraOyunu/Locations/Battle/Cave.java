package Dersler.Bolum03MaceraOyunu.Locations.Battle;

import Dersler.Bolum03MaceraOyunu.Obstacles.Zombie;
import Dersler.Bolum03MaceraOyunu.Player;

public class Cave extends BattleLocation {
    public Cave(Player player) {
        super(player, "Mağara", new Zombie(), "food", 3);
    }
}
