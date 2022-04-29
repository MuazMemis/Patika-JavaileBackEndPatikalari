package Dersler.Bolum03MaceraOyunu.Locations.Battle;

import Dersler.Bolum03MaceraOyunu.Obstacles.Bear;
import Dersler.Bolum03MaceraOyunu.Player;

public class River extends BattleLocation {
    public River(Player player) {
        super(player, "Nehir", new Bear(), "water", 2);
    }
}
