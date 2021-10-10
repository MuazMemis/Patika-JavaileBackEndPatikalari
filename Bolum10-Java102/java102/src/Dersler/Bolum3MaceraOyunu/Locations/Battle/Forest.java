package Dersler.Bolum3MaceraOyunu.Locations.Battle;

import Dersler.Bolum3MaceraOyunu.Obstacles.Vampire;
import Dersler.Bolum3MaceraOyunu.Player;

public class Forest extends BattleLocation {
    public Forest(Player player) {
        super(player, "Orman", new Vampire(), "firewood", 3);
    }
}
