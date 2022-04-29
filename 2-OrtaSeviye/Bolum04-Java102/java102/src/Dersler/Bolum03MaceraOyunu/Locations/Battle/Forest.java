package Dersler.Bolum03MaceraOyunu.Locations.Battle;

import Dersler.Bolum03MaceraOyunu.Obstacles.Vampire;
import Dersler.Bolum03MaceraOyunu.Player;

public class Forest extends BattleLocation {
    public Forest(Player player) {
        super(player, "Orman", new Vampire(), "firewood", 3);
    }
}
